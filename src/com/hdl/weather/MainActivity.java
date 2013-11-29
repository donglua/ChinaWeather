package com.hdl.weather;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.xmlpull.v1.XmlPullParser;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button queryhBtn;
	private EditText cityEdit;
	private HttpClient client = null;
	private XmlPullParser xpp;
	private ListView mListView;
	private SimpleAdapter mAdapter;
	private List<Map<String, Object>> maps = null;
	private ProgressDialog progressDialog;  
	
	private Handler mHandler = new Handler()
	{
		@Override
		public void handleMessage(Message msg) {
			String city = "";
			try {
				city = Utils.toPinyin(cityEdit.getText().toString());
			} catch (BadHanyuPinyinOutputFormatCombination e) {
				e.printStackTrace();
			}
			queryWeather(city);
			mAdapter.notifyDataSetChanged();
			progressDialog.cancel();
		};
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		cityEdit = (EditText) findViewById(R.id.city);
		queryhBtn = (Button) findViewById(R.id.btn_search);
		mListView = (ListView) findViewById(R.id.listView);
		
		xpp = Xml.newPullParser(); 
		maps = new ArrayList<Map<String, Object>>();
		mAdapter = new SimpleAdapter(
						MainActivity.this, maps, R.layout.list_item, 
						new String[] { "cityname", "tem", "img1", "stateDetailed" },
						new int[] { R.id.cityname, R.id.tem, R.id.img1, R.id.stateDetailed });
		
		mAdapter.setViewBinder(new SimpleAdapter.ViewBinder() {
			@Override
			public boolean setViewValue(View view, Object data,
					String textRepresentation) {
				if (view instanceof ImageView && data instanceof Bitmap) {
					ImageView iv = (ImageView) view;
					iv.setImageBitmap((Bitmap) data);
					return true;
				} else
					return false;
			}
		});
		
		mListView.setAdapter(mAdapter);
		
		queryhBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				progressDialog = ProgressDialog.show(MainActivity.this, "Loading...", "Please wait...", true, false);
				progressDialog.setIndeterminate(true);
				progressDialog.setCancelable(true);
				
				// new Thread() {
				// public void run() {
				// mHandler.sendEmptyMessage(1);
				// };
				// }.start();
				 
				new Timer().schedule(new TimerTask() {
					@Override
					public void run() {
						mHandler.sendEmptyMessage(1);						
					}
				}, 100);
			}
		});
		
		mListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent mIntent = new Intent();
				mIntent.putExtra("url", maps.get(position).get("url").toString());
				mIntent.setClass(MainActivity.this, WeatherDetail.class);
				startActivity(mIntent);
			}
		});
	}

	private void queryWeather(String city) {
		client = new DefaultHttpClient();
		maps.clear();
		HttpGet get = new HttpGet("http://flash.weather.com.cn/wmaps/xml/" + city + ".xml");
		HttpResponse response = null;
		try {
			response = client.execute(get);
			InputStream input = response.getEntity().getContent();
			xpp.setInput(input, "utf-8");
			
			int event = xpp.getEventType();
			Map<String, Object> map = null;
			while (event != XmlPullParser.END_DOCUMENT) {
				switch (event) {
				case XmlPullParser.START_TAG:
					if ("city".equals(xpp.getName())) {
						map = new HashMap<String, Object>();
						
						map.put("cityname", xpp.getAttributeValue(3));
						map.put("tem", xpp.getAttributeValue(9) + "℃~" + xpp.getAttributeValue(10) + "℃  " +  xpp.getAttributeValue(12));
						URL imgUrl1 = new URL( "http://m.weather.com.cn/img/b" + xpp.getAttributeValue(6) + ".gif");
						map.put("img1", BitmapFactory.decodeStream(imgUrl1.openStream()));
						map.put("stateDetailed", xpp.getAttributeValue(8));
						map.put("url", xpp.getAttributeValue(17));
						
						maps.add(map);
					}
					break;
				}
				event = xpp.next();
			}
		} catch (IOException e) {
			Toast.makeText(MainActivity.this, "网络连接失败", Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		} catch (Exception e) {
			Toast.makeText(MainActivity.this, "找不到城市" + "\"" + city + "\"的天气", Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("退出").setOnMenuItemClickListener(
				new OnMenuItemClickListener() {
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						MainActivity.this.finish();
						System.exit(0);
						return true;
					}
				});
		return true;
	}
}