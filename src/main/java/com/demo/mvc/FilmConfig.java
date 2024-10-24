package com.demo.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.demo.mvc.filter.BusFilter;

@Configuration

public class FilmConfig 
{
	@Bean
	public BusFilter getFilter() {
		return new BusFilter();
	}
	
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getFilter()).addPathPatterns("/*");
	}
}
