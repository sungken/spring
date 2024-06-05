package com.test.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("/member/login.do")
	public String login() {
		
		return "member/login";
	}
	
	@GetMapping("/member/logout.do")
	public String logout() {
		
		return "member/logout";
	}
	
}



















