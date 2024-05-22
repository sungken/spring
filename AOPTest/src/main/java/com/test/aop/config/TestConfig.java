package com.test.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.aop.singleton.TestDAO;

@Configuration
public class TestConfig {
	
	@Bean // 자바 설정으로 bean만들기
	public TestDAO getTestDAO() {
		
		return new TestDAO();
	}
	
}
