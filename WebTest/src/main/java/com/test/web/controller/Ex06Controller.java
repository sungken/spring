package com.test.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.web.dto.AddressDTO;

@Controller
public class Ex06Controller{
	
	@GetMapping(value = "/add.do")
	public String add() {
		
		
		return "add";
	}
	
	
	//1.
//	@PostMapping(value = "/addok.do")
//	//입력값이 자동으로 들어가게 하기
//	public String addok(HttpServletRequest req) {
//		
//		//req.setCharacterEncoding("UTF-8"); 따로 변환하지 않고 필터로 처리한다.
//		String num = req.getParameter("num"); // add.jsp에서 <input type="text" name="num"> 부분의 num에 넣는다.
//		
//		//ModelAndView mv;
//		
//		req.setAttribute("num", num);
//		
//		return "addok";
//	}
	
	
	
	//2.
	//스프링에서는 요청 메서드에게 넘어오는 대부분의 데이터를 매개 변수 형태로 받는다. > 1.보다 생략 가능
//	@PostMapping("/addok.do") //requst get Prameter을 사용한것과 동
//	public String addok(@RequestParam("num") String num) { // <input type="text" name="num">키값(name)이 동일값이다.
//		
//		System.out.println(num);
//		
//		return "addok";
//	}
	
	
//	//3.
//	@PostMapping("/addok.do") //requst get Prameter을 사용한것과 동
//	public String addok(String num, Model model) { // <input type="text" name="num">키값(name)이 동일값이다. > 2.보다 생략 가능
//		
//		System.out.println(num);
//		
//		//ModelAndView
//		model.addAttribute("num", num);
//		
//		
//		return "addok";
//	}
	
	//4.
//	@PostMapping("/addok.do")
//	public String addok(Model model,
//						@RequestParam("name") String name,
//						@RequestParam("age") String age,
//						@RequestParam("address") String address) {
		
//	public String addok(Model model,
//						String name,
//						int age,
//						String address) {
//		//가장 많이하는 행동? > DTO에 담기
//		AddressDTO dto = new AddressDTO();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//				
////		model.addAttribute("name", name);
////		model.addAttribute("age", age);
////		model.addAttribute("address",address);
//		
//		model.addAttribute("dto", dto);
//		
//		
//		return "addok";
//	}
	
	
//	//5.
//	@PostMapping("/addok.do")
//	public String addok(Model model, AddressDTO dto) {
//		
//		//1. req.getParameter
//		//2. DRO 생성
//
//		model.addAttribute("dto", dto);
//
//		return "addok";
//	}
	
//	//6.
//		@PostMapping("/addok.do")
//		public String addok(Model model, AddressDTO dto, String id) { // id는 예상치 못게 추가된 부분
//			
//			//1. req.getParameter
//			//2. DRO 생성
//
//			model.addAttribute("dto", dto);
//
//			return "addok";
//		}
	
//	//7.
//		@PostMapping("/addok.do")
//		public String addok(Model model, AddressDTO dto, @RequestParam(defaultValue = "100") int id) { 
//			
//			//1. req.getParameter
//			//2. DRO 생성
//
//			model.addAttribute("dto", dto);
//
//			return "addok";
//		}
	
//	//8.
//	@PostMapping("/addok.do")
//	public String addok(Model model, 
//						//String cb
//						@RequestParam("cb") String[] cb) // 배열로 받기 @RequestParam 붙여서 사용하자!!!!!!!!!!!!!!!!!!!!
////						@RequestParam("cb") List<String> cb) // 배열로 받기
////						@RequestParam("cb") ArrayList<String> cb) // ArrayList로 받기 
////						ArrayList<String> cb) // 에러(받을수 없다.)(사용X)
////						String[] cb) // 가능(사용X)
//	{
//		
////		System.out.println(cb);
////		System.out.println(Arrays.toString(cb));
//
//		return "addok";
//	}
	
	//9.
	@PostMapping("/addok.do")
	public String addok(Model model, @ModelAttribute("num") String num){
		
		//@ModelAttribute
		//- 모델 객체에 데이처를 추가하지 않아도 자동으로 추가된다.
		
//		model.addAttribute("num", num);

		return "addok";
	}
	
	
}



























