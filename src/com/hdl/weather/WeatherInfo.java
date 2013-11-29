package com.hdl.weather;

import com.google.gson.annotations.SerializedName;

public class WeatherInfo {
	@SerializedName("city")
	private String city;
	@SerializedName("date_y")
	private String date_y;
	@SerializedName("week")
	private String week;
	@SerializedName("temp1")
	private String temp1;    
	
	@SerializedName("temp2")
	private String temp2;       
	@SerializedName("temp3")
	private String temp3;       
	@SerializedName("temp4")
	private String temp4;       
	@SerializedName("temp5")
	private String temp5;       
	@SerializedName("temp6")
	private String temp6;       
	
	@SerializedName("weather1")
	private String weather1;        // "晴转阴"			//同温度一样也是19日凌晨也可以说成是18日23:59:59秒//下面类推  
	@SerializedName("weather2")
	private String weather2;        // "阴转多云"  
	@SerializedName("weather3")
	private String weather3;        // "多云转晴"  
	@SerializedName("weather4")
	private String weather4;        // "晴转多云"  
	@SerializedName("weather5")
	private String weather5;        // "阴"  
	@SerializedName("weather6")
	private String weather6;        // "多云"  

//	private img1        "0"			//对应的显示图片编号  
//	private img2        "2"  
//	private img3        "2"  
//	private img4        "1"  
//	private img5        "1"  
//	private img6        "0"  
//	private img7        "0"  
//	private img8        "1"  
//	private img9        "2"  
//	private img10       "99"		//这个就不对了不知道为啥  
//	private img11       "1"  
//	private img12       "99"  
//	private img_single      "2"  
//	private img_title1      "晴"//18日夜间  
//	private img_title2      "阴"//19日白天  
//	private img_title3      "阴"//19日夜间  
//	private img_title4      "多云"//20日白天  
//	private img_title5      "多云"//20日夜间 一次类推  
//	private img_title6      "晴"  
//	private img_title7      "晴"  
//	private img_title8      "多云"  
//	private img_title9      "阴"  
//	private img_title10     "阴"  
//	private img_title11     "多云"  
//	private img_title12     "多云"  
//	private img_title_single        "阴"  
	
	@SerializedName("wind1")
	private String wind1 ;     //"微风"//一天的风力  
	@SerializedName("wind2")
	private String wind2 ;     //"微风"  
	@SerializedName("wind3")
	private String wind3 ;     //"微风"  
	@SerializedName("wind4")
	private String wind4 ;     //"微风"  
	@SerializedName("wind5")
	private String wind5 ;     //"微风"  
	@SerializedName("wind6")
	private String wind6 ;     //"微风"  
	
	@SerializedName("fl1")
	private String fl1; // "小于3级"//风力
	@SerializedName("fl2")
	private String fl2; // "小于3级"
	@SerializedName("fl3")
	private String fl3; // "小于3级"
	@SerializedName("fl4")
	private String fl4; // "小于3级"
	@SerializedName("fl5")
	private String fl5; // "小于3级"
	@SerializedName("fl6")
	private String fl6; // "小于3级"

	@SerializedName("index")
 	private String index      ; //"舒适"//舒适度指数  
	@SerializedName("index_d")
 	private String index_d    ; //"建议着薄型套装或牛仔衫裤等春秋过渡装。年老体弱者宜着套装、夹克衫等。 //对应的描述   
	@SerializedName("index48")
 	private String index48    ; //"暖"///这2个不清楚了  
	@SerializedName("index48_d")
 	private String index48_d  ; //"较凉爽，建议着长袖衬衫加单裤等春秋过渡装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"  
	@SerializedName("index_uv")
 	private String index_uv   ; //"最弱"//紫外线指数  
	@SerializedName("index48_uv")
 	private String index48_uv ; //"弱"  
	@SerializedName("index_xc")
 	private String index_xc   ; //"适宜"//洗车指数  
	@SerializedName("index_tr")
 	private String index_tr   ; //"很适宜"//旅游指数  
	@SerializedName("index_co")
 	private String index_co   ; //"舒适"//舒适度指数  

	@SerializedName("index_cl")
	private String index_cl ;       //"较适宜"		//晨练指数  
	@SerializedName("index_ls")
	private String index_ls ;       //"不太适宜" 	//晾晒指数  
	@SerializedName("index_ag")
	private String index_ag ;       //"不易发" 	//    息斯敏过敏气象指数  
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate_y() {
		return date_y;
	}
	public void setDate_y(String date_y) {
		this.date_y = date_y;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTemp2() {
		return temp2;
	}
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}
	public String getTemp4() {
		return temp4;
	}
	public void setTemp4(String temp4) {
		this.temp4 = temp4;
	}
	public String getTemp5() {
		return temp5;
	}
	public void setTemp5(String temp5) {
		this.temp5 = temp5;
	}
	public String getTemp6() {
		return temp6;
	}
	public void setTemp6(String temp6) {
		this.temp6 = temp6;
	}
	public String getWeather1() {
		return weather1;
	}
	public void setWeather1(String weather1) {
		this.weather1 = weather1;
	}
	public String getWeather2() {
		return weather2;
	}
	public void setWeather2(String weather2) {
		this.weather2 = weather2;
	}
	public String getWeather3() {
		return weather3;
	}
	public void setWeather3(String weather3) {
		this.weather3 = weather3;
	}
	public String getWeather4() {
		return weather4;
	}
	public void setWeather4(String weather4) {
		this.weather4 = weather4;
	}
	public String getWeather5() {
		return weather5;
	}
	public void setWeather5(String weather5) {
		this.weather5 = weather5;
	}
	public String getWeather6() {
		return weather6;
	}
	public void setWeather6(String weather6) {
		this.weather6 = weather6;
	}
	public String getWind1() {
		return wind1;
	}
	public void setWind1(String wind1) {
		this.wind1 = wind1;
	}
	public String getWind2() {
		return wind2;
	}
	public void setWind2(String wind2) {
		this.wind2 = wind2;
	}
	public String getWind3() {
		return wind3;
	}
	public void setWind3(String wind3) {
		this.wind3 = wind3;
	}
	public String getWind4() {
		return wind4;
	}
	public void setWind4(String wind4) {
		this.wind4 = wind4;
	}
	public String getWind5() {
		return wind5;
	}
	public void setWind5(String wind5) {
		this.wind5 = wind5;
	}
	public String getWind6() {
		return wind6;
	}
	public void setWind6(String wind6) {
		this.wind6 = wind6;
	}
	public String getFl1() {
		return fl1;
	}
	public void setFl1(String fl1) {
		this.fl1 = fl1;
	}
	public String getFl2() {
		return fl2;
	}
	public void setFl2(String fl2) {
		this.fl2 = fl2;
	}
	public String getFl3() {
		return fl3;
	}
	public void setFl3(String fl3) {
		this.fl3 = fl3;
	}
	public String getFl4() {
		return fl4;
	}
	public void setFl4(String fl4) {
		this.fl4 = fl4;
	}
	public String getFl5() {
		return fl5;
	}
	public void setFl5(String fl5) {
		this.fl5 = fl5;
	}
	public String getFl6() {
		return fl6;
	}
	public void setFl6(String fl6) {
		this.fl6 = fl6;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getIndex_d() {
		return index_d;
	}
	public void setIndex_d(String index_d) {
		this.index_d = index_d;
	}
	public String getIndex48() {
		return index48;
	}
	public void setIndex48(String index48) {
		this.index48 = index48;
	}
	public String getIndex48_d() {
		return index48_d;
	}
	public void setIndex48_d(String index48_d) {
		this.index48_d = index48_d;
	}
	public String getIndex_uv() {
		return index_uv;
	}
	public void setIndex_uv(String index_uv) {
		this.index_uv = index_uv;
	}
	public String getIndex48_uv() {
		return index48_uv;
	}
	public void setIndex48_uv(String index48_uv) {
		this.index48_uv = index48_uv;
	}
	public String getIndex_xc() {
		return index_xc;
	}
	public void setIndex_xc(String index_xc) {
		this.index_xc = index_xc;
	}
	public String getIndex_tr() {
		return index_tr;
	}
	public void setIndex_tr(String index_tr) {
		this.index_tr = index_tr;
	}
	public String getIndex_co() {
		return index_co;
	}
	public void setIndex_co(String index_co) {
		this.index_co = index_co;
	}
	public String getIndex_cl() {
		return index_cl;
	}
	public void setIndex_cl(String index_cl) {
		this.index_cl = index_cl;
	}
	public String getIndex_ls() {
		return index_ls;
	}
	public void setIndex_ls(String index_ls) {
		this.index_ls = index_ls;
	}
	public String getIndex_ag() {
		return index_ag;
	}
	public void setIndex_ag(String index_ag) {
		this.index_ag = index_ag;
	}
	
	@Override
	public String toString() {
		return "WeatherInfo [city=" + city + ", date_y=" + date_y + ", week="
				+ week + ", temp1=" + temp1 + ", temp2=" + temp2 + ", temp3="
				+ temp3 + ", temp4=" + temp4 + ", temp5=" + temp5 + ", temp6="
				+ temp6 + ", weather1=" + weather1 + ", weather2=" + weather2
				+ ", weather3=" + weather3 + ", weather4=" + weather4
				+ ", weather5=" + weather5 + ", weather6=" + weather6
				+ ", wind1=" + wind1 + ", wind2=" + wind2 + ", wind3=" + wind3
				+ ", wind4=" + wind4 + ", wind5=" + wind5 + ", wind6=" + wind6
				+ ", fl1=" + fl1 + ", fl2=" + fl2 + ", fl3=" + fl3 + ", fl4="
				+ fl4 + ", fl5=" + fl5 + ", fl6=" + fl6 + ", index=" + index
				+ ", index_d=" + index_d + ", index48=" + index48
				+ ", index48_d=" + index48_d + ", index_uv=" + index_uv
				+ ", index48_uv=" + index48_uv + ", index_xc=" + index_xc
				+ ", index_tr=" + index_tr + ", index_co=" + index_co
				+ ", index_cl=" + index_cl + ", index_ls=" + index_ls
				+ ", index_ag=" + index_ag + "]";
	}
	
}
