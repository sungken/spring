package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// 스프링이 빈으로 관리하는 대상이 있는 곳 > component-scan base-package="com.test.web"


//빈이 되기 위한 자격
//- @Component 를 붙여야 빈이되고 스프링으로 사용할수 있다. -> com.test.controller의 Student 확인
//- @Controller > 컨트롤러 역할
//- @Service > 서비스 역할
//- @Repository > DAO 역할


@Controller
public class Ex07Controller {
	
	//WARN : org.springframework.web.servlet.PageNotFound 
	//- No mapping found for HTTP request with URI [/web/ex07.do] in DispatcherServlet with name 'appServlet'
	@GetMapping("/ex07.do")
	public String ex07() {
		
		
		
		return "ex07";
	}

}
