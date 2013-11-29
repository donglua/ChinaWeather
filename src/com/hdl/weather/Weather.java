package com.hdl.weather;

import com.google.gson.annotations.SerializedName;

public class Weather {
	@SerializedName("weatherinfo")
	private WeatherInfo weatherInfo;

	public WeatherInfo getWeatherInfo() {
		return weatherInfo;
	}

	public void setWeatherInfo(WeatherInfo weatherInfo) {
		this.weatherInfo = weatherInfo;
	}
}
