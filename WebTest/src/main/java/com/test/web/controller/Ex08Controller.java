package com.test.web.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.web.dto.AddressDTO;

@Controller
public class Ex08Controller{

//	//1. String - 리턴값이 String 일떄
//	//- JSP 파일 경로
//	//- ViewResolver
//	@GetMapping("/ex08.do")
//	public String ex08() {
//		
//		return "ex08";
//	}
	
//	//2. void - 리턴값이 없어도 호출은 가능하지만 헷갈린다.
//	@GetMapping("/ex08.do")
//	public void ex08() {
//		
//		System.out.println("페이지 호출");
//		
//		//뷰 호출
//		//return "ex08";
//		
//	}
	
//	//3. String 키워드
//	//- "redirect:URL" > resp.sendRedirect(URL)
//	//- "forward:URL" > PageContext.forward(URL)
//	@GetMapping("/ex08.do")
//	public String ex08() {
//		
//		return "redirect:/add.do";
//	}
	
//	//4. String 키워드
//	//- "redirect:URL" > resp.sendRedirect(URL)
//	//- "forward:URL" > PageContext.forward(URL)
//	// QueryString 생성 기능
//	@GetMapping("/ex08.do")
//	public String ex08(RedirectAttributes rttr) {
//		
//		rttr.addAttribute("seq", 10);
//		rttr.addAttribute("mode", "del");
//		
//		return "redirect:/add.do";
//	}
	
//	//5. JSON
//	//- JSON 생성
//	//- 의존성 1개 추가 > jackson-databind
//	@GetMapping("/ex08.do")
//	public @ResponseBody String ex08() {
//		
//		String name = "Hong";
//		
//		//파일 [/WEB-INF/views/name.jsp]을(를) 찾을 수 없습니다.
//		//@ResponseBody를 붙여줘야 반환한다.
//		return name;
//	}
	
	
//	//6. JSON
//	@GetMapping("/ex08.do")
//	public @ResponseBody AddressDTO ex08() {
//		
//		AddressDTO dto = new AddressDTO();
//		dto.setName("hong");
//		dto.setAge(20);
//		dto.setAddress("seoul");
//		
//		return dto;
//	}
	
	
//	//7.    --- 다시 확인해보기
//	@GetMapping("/ex08.do")
//	public @ResponseBody List<String> ex08() {
//	
//	List list = List.of("홍길동", "아무개", "하하하", "호호호", "후후후");
//	
//	return list;
//}
	
	
	
	//8.    --- 다시 확인해보기
	@GetMapping("/ex08.do")
	public @ResponseBody ArrayList<AddressDTO> ex08() {
		
		AddressDTO dto = new AddressDTO();
		dto.setName("홍길동");
		dto.setAge(20);
		dto.setAddress("서울시");
		
		AddressDTO dto2 = new AddressDTO();
		dto2.setName("아무개");
		dto2.setAge(22);
		dto2.setAddress("부산시");
		
		ArrayList<AddressDTO> list = new ArrayList<AddressDTO>();
		list.add(dto);
		list.add(dto2);
		
		return list;
	}

	
}



























