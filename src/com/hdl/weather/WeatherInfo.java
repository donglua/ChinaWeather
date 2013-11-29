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
	private String weather1;        // "��ת��"			//ͬ�¶�һ��Ҳ��19���賿Ҳ����˵����18��23:59:59��//��������  
	@SerializedName("weather2")
	private String weather2;        // "��ת����"  
	@SerializedName("weather3")
	private String weather3;        // "����ת��"  
	@SerializedName("weather4")
	private String weather4;        // "��ת����"  
	@SerializedName("weather5")
	private String weather5;        // "��"  
	@SerializedName("weather6")
	private String weather6;        // "����"  

//	private img1        "0"			//��Ӧ����ʾͼƬ���  
//	private img2        "2"  
//	private img3        "2"  
//	private img4        "1"  
//	private img5        "1"  
//	private img6        "0"  
//	private img7        "0"  
//	private img8        "1"  
//	private img9        "2"  
//	private img10       "99"		//����Ͳ����˲�֪��Ϊɶ  
//	private img11       "1"  
//	private img12       "99"  
//	private img_single      "2"  
//	private img_title1      "��"//18��ҹ��  
//	private img_title2      "��"//19�հ���  
//	private img_title3      "��"//19��ҹ��  
//	private img_title4      "����"//20�հ���  
//	private img_title5      "����"//20��ҹ�� һ������  
//	private img_title6      "��"  
//	private img_title7      "��"  
//	private img_title8      "����"  
//	private img_title9      "��"  
//	private img_title10     "��"  
//	private img_title11     "����"  
//	private img_title12     "����"  
//	private img_title_single        "��"  
	
	@SerializedName("wind1")
	private String wind1 ;     //"΢��"//һ��ķ���  
	@SerializedName("wind2")
	private String wind2 ;     //"΢��"  
	@SerializedName("wind3")
	private String wind3 ;     //"΢��"  
	@SerializedName("wind4")
	private String wind4 ;     //"΢��"  
	@SerializedName("wind5")
	private String wind5 ;     //"΢��"  
	@SerializedName("wind6")
	private String wind6 ;     //"΢��"  
	
	@SerializedName("fl1")
	private String fl1; // "С��3��"//����
	@SerializedName("fl2")
	private String fl2; // "С��3��"
	@SerializedName("fl3")
	private String fl3; // "С��3��"
	@SerializedName("fl4")
	private String fl4; // "С��3��"
	@SerializedName("fl5")
	private String fl5; // "С��3��"
	@SerializedName("fl6")
	private String fl6; // "С��3��"

	@SerializedName("index")
 	private String index      ; //"����"//���ʶ�ָ��  
	@SerializedName("index_d")
 	private String index_d    ; //"�����ű�����װ��ţ������ȴ������װ������������������װ���п����ȡ� //��Ӧ������   
	@SerializedName("index48")
 	private String index48    ; //"ů"///��2���������  
	@SerializedName("index48_d")
 	private String index48_d  ; //"����ˬ�������ų�������ӵ���ȴ������װ������������������֯�����������׺ͳ��㡣"  
	@SerializedName("index_uv")
 	private String index_uv   ; //"����"//������ָ��  
	@SerializedName("index48_uv")
 	private String index48_uv ; //"��"  
	@SerializedName("index_xc")
 	private String index_xc   ; //"����"//ϴ��ָ��  
	@SerializedName("index_tr")
 	private String index_tr   ; //"������"//����ָ��  
	@SerializedName("index_co")
 	private String index_co   ; //"����"//���ʶ�ָ��  

	@SerializedName("index_cl")
	private String index_cl ;       //"������"		//����ָ��  
	@SerializedName("index_ls")
	private String index_ls ;       //"��̫����" 	//��ɹָ��  
	@SerializedName("index_ag")
	private String index_ag ;       //"���׷�" 	//    Ϣ˹����������ָ��  
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
