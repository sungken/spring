package com.test.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice //컨트롤러에서 에러가 났을때 이놈이 가로체서 출력됨
public class CommonExceptionAdvice {
	
	@ExceptionHandler(Exception.class)
	public String except(Exception e, Model model) {
		
		
		return "error";		
	}
	
	
	//404에러가 났을경우 대비
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle4040(NoHandlerFoundException e) {
		
		return "notfound";
	}
	
}










