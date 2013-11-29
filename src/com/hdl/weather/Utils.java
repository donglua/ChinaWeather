package com.hdl.weather;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {
	static HanyuPinyinOutputFormat outputFormat = new HanyuPinyinOutputFormat();

	@SuppressWarnings("deprecation")
	public static String toPinyin(String str)
			throws BadHanyuPinyinOutputFormatCombination {
		outputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		outputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		outputFormat.setVCharType(HanyuPinyinVCharType.WITH_V);
		return PinyinHelper.toHanyuPinyinString(str, outputFormat, "");
	}
	
	
    /*
     * �ж����������Ƿ��ѿ�
     * 2012-08-20
     *true �Ѵ�  false δ��
     * */
    public static boolean isConn(Context context){
        boolean bisConnFlag=false;
        ConnectivityManager conManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network = conManager.getActiveNetworkInfo();
        if(network!=null){
            bisConnFlag=conManager.getActiveNetworkInfo().isAvailable();
        }
        return bisConnFlag;
    }
	
}
