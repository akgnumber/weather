package com.waylau.spring.cloud.weather.service;

public interface WeatherDataCollectionService {
	
	/**
	 * 把第三方数据保存到本地
	 * @param cityId
	 */
	void sysncDataByCityId(String cityId);
}
