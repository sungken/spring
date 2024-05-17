package com.test.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// JSP Model2(MVC패턴)
//- Controller > 클라이언트 요청 + 흐름 통제 > Java 서블릿
//- View > 반환할 뷰 페이지 작성 > JSP 페이지
//- Model > 데이터 처리 + 이동


//이전 수업 > Servlet
//- Controller > 일반 Java 클래스(개발자가 Servlet을 쓰지 않는다.)
//- View > JSP 페이지 사용
//- Model > 동일

// 컨트롤러도 스프링 빈으로 등록해야 한다!!!!!!!(pom.xml에 넣기)
public class Ex01Controller implements Controller {
	
	
	// 서블릿의 doGet, doPost와 같다(의미도 같음)
	//handleRequest == doGet, doPost 역할
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//업무 코드 작성
		
		//뷰 호출하기
//		request.getRequestDispatcher("hello.jsp").forward(req, resp);  이제 이렇게 사용하지 않는다.
		// 모델과 뷰 동시 생성(스프링으로)
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/WEB-INF/views/ex01.jsp");
		mv.setViewName("ex01");
		
		
		return mv; // forward() 작업 이다.
	}
	
}




























