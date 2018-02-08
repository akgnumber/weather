package com.waylau.spring.cloud.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.cloud.weather.vo.Weather;
import com.waylau.spring.cloud.weather.vo.WeatherResponse;

@Service
public class WeatherReportServiceImpl implements WeatherReportService{
	
	@Autowired
	private WeatherDataService weatherDataService;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		WeatherResponse resp = weatherDataService.getDataByCityId(cityId);
		return resp.getData();
	}

}
