package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러 구현
//1. Controller 인터페이스 구현
//2. 어노테이션 사용

@Controller
@RequestMapping(value="/ex04.do") //이렇게 하면 bean에서 name="/ex02.do"이런 형식의 이름을 대신해준다.
public class Ex04Controller{
	
	//요청 메서드 > 맘대로 구현~~~~~~~
	@RequestMapping
	public String test() {
		
		//업무 코드
		
		
		return "ex04";	//ModelAndView 처리 동반 + ViewResolver 동작
	}
	
}




























