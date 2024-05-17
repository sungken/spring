package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Ex02Controller implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		//업무 코드
		//DB 작업 > 반환값
		int count = 123;
		String name = "홍길동";
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ex02");
		
		// JSP에게 전달할 데이터
		// 이렇게 잘 하지 않는다.
//		request.setAttribute("count", count);
//		request.setAttribute("name", name);
		
		//스프링 > 되도록 requst, response 개발자에게 노출(X)
		// 스프링에서는 이렇게 사용
		mv.addObject("count", count);
		mv.addObject("name", name);
		
		return mv;
	}
	
}



























