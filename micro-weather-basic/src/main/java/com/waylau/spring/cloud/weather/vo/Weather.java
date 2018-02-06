package com.waylau.spring.cloud.weather.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息
 * @author Administrator
 *
 */
public class Weather implements Serializable{
	
	private static final long serialVersionUID = 1l; 
	
	private Yesterday yesterday;
	
	private String city;
	
	private String aqi;
	
	private List<Forecast> forecast;
	/*	感冒*/
	private String cold;
	
	private String ganmao;
	
	private String wendu;
	/*	温度*/
	private String temperature;
	
	public Yesterday getYesterday() {
		return yesterday;
	}
	public void setYesterday(Yesterday yesterday) {
		this.yesterday = yesterday;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAqi() {
		return aqi;
	}
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}
	public List<Forecast> getForecast() {
		return forecast;
	}
	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}
	public String getCold() {
		return cold;
	}
	public void setCold(String cold) {
		this.cold = cold;
	}
	public String getGanmao() {
		return ganmao;
	}
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}
	public String getWendu() {
		return wendu;
	}
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
}
