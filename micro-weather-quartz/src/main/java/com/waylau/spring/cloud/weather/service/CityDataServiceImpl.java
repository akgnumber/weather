package com.waylau.spring.cloud.weather.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.waylau.spring.cloud.weather.util.XmlBuiler;
import com.waylau.spring.cloud.weather.vo.City;
import com.waylau.spring.cloud.weather.vo.CityList;

@Service
public class CityDataServiceImpl implements CityDataService{

//	private static final String xmlStr = "/";
	@Override
	public List<City> listCity() throws Exception {
		
		Resource resource = new ClassPathResource("citylist.xml");
		BufferedReader bf = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
		StringBuffer buffer = new StringBuffer();
		String line = "";
		
		while ( (line = bf.readLine()) != null) {
			buffer.append(line);
		}
		bf.close();
		
		//
		CityList cityList = (CityList)XmlBuiler.xmlStrToObject(CityList.class, buffer.toString());
		return cityList.getCityList();
	}

}
