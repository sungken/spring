package com.test.begin.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//1. 개발자가 직접 만들기
//		Hong hong = new Hong();

		
		//2. 스프링을 통해서 생성 > 빈 생성
		//- di3.xml 환경 설정을 읽어오기
//		ApplicationContext context = new ClassPathXmlApplicationContext("file:/src/main/java/com/test/begin/di3/di3.xml"); > 원본 경로 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/begin/di3/di3.xml"); // 상대경로
		
		
		Hong hong = (Hong)context.getBean("hong"); // di3.xml에서 아이디 가져오기
//		hong.coding();
		
		// 스프링에서 의존 주입 구현
		Service service = (Service)context.getBean("service");
		
		
		//service.setHong(hong); > 스프링에서 미리 만들기
		
		service.work(); 
		
		
		//-----------------------------------
		Hong hong2 = (Hong)context.getBean("hong2"); // di3.xml 식별자 확인
		Hong hong3 = (Hong)context.getBean("h1");
		Hong hong4 = (Hong)context.getBean("h2");
		Hong hong5 = (Hong)context.getBean("h3");
		
		hong2.coding();
		hong3.coding();
		hong4.coding();
		hong5.coding();
		
	}

}















