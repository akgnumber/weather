package com.waylau.spring.cloud.weather.vo;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 */
public class WeatherResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private Weather data;
	private Integer status;
	private String desc;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Weather getDate() {
		return data;
	}

	public void setDate(Weather data) {
		this.data = data;
	}
	
}
