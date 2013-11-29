package com.hdl.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class WeatherDetail extends Activity {
	private TextView city; 
	private TextView temp; 
	private TextView weather; 
	private TextView wind; 
	private TextView index_d; 
	private TextView index_uv; 
	private TextView index_xc; 
	private TextView index_tr; 
	private TextView index_co; 
	private TextView index_cl; 
	private TextView index_ls; 
	private TextView index_ag; 
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		initView();
		
		HttpClient client = new DefaultHttpClient();
		String url = "http://m.weather.com.cn/data/" + getIntent().getStringExtra("url") + ".html";
		HttpGet get = new HttpGet(url);
		InputStream in = null;
		try {
			in = client.execute(get).getEntity().getContent();
		} catch (IOException e) {
			e.printStackTrace();
			Toast.makeText(WeatherDetail.this, "Õ¯¬Á¡¨Ω” ß∞‹", Toast.LENGTH_SHORT).show();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		Gson gson = new Gson();
	 	Weather mWeather =  gson.fromJson(br, Weather.class);
	 	WeatherInfo info = mWeather.getWeatherInfo();
	 	
		// System.out.println(info.toString());
	 	
	 	city      .setText(info.getCity());
	 	temp      .setText(info.getTemp1());
	 	weather   .setText(info.getWeather1());
	 	wind      .setText(info.getWind1());
	 	index_d   .setText(info.getIndex_d());
	 	index_uv  .setText(info.getIndex_uv());
	 	index_xc  .setText(info.getIndex_xc());
	 	index_tr  .setText(info.getIndex_tr());
	 	index_co  .setText(info.getIndex_co());
	 	index_cl  .setText(info.getIndex_cl());
	 	index_ls  .setText(info.getIndex_ls());
	 	index_ag  .setText(info.getIndex_ag());
	 	
	}

	void initView() {
		city      = (TextView) findViewById(R.id.dCity);
		temp      = (TextView) findViewById(R.id.dTemp1);
		weather   = (TextView) findViewById(R.id.dWeather1);
		wind      = (TextView) findViewById(R.id.dWind1_fl1);
		index_d   = (TextView) findViewById(R.id.dIndex_d);
		index_uv  = (TextView) findViewById(R.id.dIndex_uv);
		index_xc  = (TextView) findViewById(R.id.dIndex_xc);
		index_tr  = (TextView) findViewById(R.id.dIndex_tr);
		index_co  = (TextView) findViewById(R.id.dIndex_co);
		index_cl  = (TextView) findViewById(R.id.dIndex_cl);
		index_ls  = (TextView) findViewById(R.id.dIndex_ls);
		index_ag  = (TextView) findViewById(R.id.dIndex_ag);
	};
}
