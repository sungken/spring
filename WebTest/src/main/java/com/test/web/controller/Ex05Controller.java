package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value="/ex05.do") //이렇게 하면 bean에서 name="/ex02.do"이런 형식의 이름을 대신해준다.
//@RequestMapping
@RequestMapping(value="/board") // 접두어로 모든 주소에 다 붙는다.
public class Ex05Controller{
	
//	@RequestMapping
//	public String ex05() {
//		
//		return "ex05"; //ex05 jsp에 리턴
//	}
	
	
	
	// 이렇게 RequestMapping을 찾지 못하므로(중복) 에러가 난다.
//	@RequestMapping 
//	public String test() {
//		
//		return "ex05";
//	}
	
	@RequestMapping(value="/ex05.do")
	public String ex05() {
		
		return "ex05";
	}
	
	@RequestMapping(value="/test.do", method = {RequestMethod.GET, RequestMethod.POST}) // 기본적으로 생략이 되어있을때는 런 method형식으로 자동 입력이 되어있다.
	// value값을 다르게 해야한다.
	// 이렇게 따로 중복되는 @RequestMapping은 가능하다.(게시판 add, edit, del 기능을 이렇게 한페이지에 따로 구현 가능)***
	public String test() {
		
		return "ex05";
	}
	
	//1.
//	// 이렇게 따로 중복되는 @RequestMapping은 가능하다.(게시판 add, edit, del 기능을 이렇게 한페이지에 따로 구현 가능)***
//	@RequestMapping(value="/add.do", method = RequestMethod.GET) //이렇게 하면 doGet 방식 
//	public String add() {
//		
//		return "add";
//	}
//	
//	@RequestMapping(value="/addok.do", method = RequestMethod.POST) //이렇게 하면 doPost 방식 
//	public String addok() {
//		
//		return "addok";
//	}
	
	
	//2.
//	@RequestMapping(value="/add.do", method = RequestMethod.GET) //이렇게 하면 doGet 방식 
//	public String add() {
//		
//		return "add";
//	}
//	
//	@RequestMapping(value="/addok.do", method = RequestMethod.POST) //이렇게 하면 doPost 방식 
//	public String addok() {
//		
//		return "addok";
//	}
	
	//3. 최종적으로 이렇게 사용하자***
	// 스프링 4.3이상의 버전에서 사용
	@GetMapping(value = "add.do") //이렇게 하면 doGet 방식 
	public String add() {
		
		return "add";
	}
	
	@PostMapping(value = "addok.do") //이렇게 하면 doPost 방식 
	public String addok() {
		
		return "addok";
	}
	
	
	
}




























