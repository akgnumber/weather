package com.waylau.spring.cloud.weather.job;

import java.util.ArrayList;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.waylau.spring.cloud.weather.service.WeatherDataCollectionService;
import com.waylau.spring.cloud.weather.vo.City;

/**
 * 
 * @author Administrator
 */
public class WeatherDataSyncJob extends QuartzJobBean{
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
	
	@Autowired
	private WeatherDataCollectionService weatherDataCollectionService;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("Weather Data Sync Job. Start!");
		//获取城市ID列表
		List<City> cityList = null;
		
		//	TODO	改为由城市数据API微服务来提供数据
		try {
//			cityList = cityDataService.listCity();
			cityList = new ArrayList<>();
			City city = new City();
			city.setCityId("101280601");
			cityList.add(city);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("【从xml中获取城市列表ID异常】message={}",e);
		}
		//遍历城市ID获取天气
		if (null == cityList) {
			return;
		}
		for (City city:cityList) {
			String cityId = city.getCityId();
			logger.info("Weather Data Sync Job");
			
			weatherDataCollectionService.sysncDataByCityId(cityId);
		}
		
		logger.info("Weather Data Sync Job. End!");
	}

}
