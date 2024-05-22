package com.test.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.aop.dao.AOPDAO;
import com.test.aop.dto.AOPDTO;
import com.test.aop.dto.BoardDTO;
import com.test.aop.dto.CommentDTO;
import com.test.aop.singleton.TestDAO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AOPController {
	
	private final AOPDAO dao; //수업용
	
	private final AOPDAO dao2;
	private final TestDAO dao3;
	
	@GetMapping(value="/test.do")
	public String test() {
		
		//MemoDTO m1 = new MemoDTO(null, null, null, null, null);
		BoardDTO b1 = new BoardDTO.BoardDTOBuilder()
								  .setSeq("1")
								  .setSubject("제목")
								  .setContent("내용")
								  .setName("홍길동")
								  .setRegdate("2024")
								  .build();
		System.out.println(b1);
		
		CommentDTO c1 = CommentDTO.builder()
								  .name("홍길동")
								  .subject("제목1")
								  .content("내용")
								  .seq("2")
								  .build();
		System.out.println(c1);
								  
		
		
		//스프링이 관리하는 모든 빈은 싱글톤이다.
		//생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.

		//스프링이 관리하는 모든 빈은 싱글톤이다.
//		System.out.println(dao == dao2);		//true
//		System.out.println(dao.equals(dao2));	//true
//		
//		System.out.println(dao3.serivce()); //data
		
		
//		AOPDTO dto1 = new AOPDTO(); //100번지
//		dto1.setName("홍길동");
//		
//		AOPDTO dto2 = new AOPDTO(); //200번지
//		dto2.setName("아무개");
//		
//		System.out.println(dto1 == dto2);		//false
//		System.out.println(dto1.equals(dto2));	//false
//		
//		
//		//DAO dao1 = new DAO();
//		
//		DAO dao2 = DAO.getInstance();
//		
//		DAO dao3 = DAO.getInstance();
//		
//		System.out.println(dao2 == dao3); 		//true
//		System.out.println(dao2.equals(dao3)); 	//true
		
		
		return "list";
	}

	
	//주요 업무 > 메모장
	//보조 업무 > 로그
	@GetMapping("/list.do")
	public String list() {
		
		System.out.println("Controller.list");
		dao.list();
		
		return "list";
	}
	
	@GetMapping("/add.do")
	public String add() {
		
		AOPDTO dto = new AOPDTO();
		dto.setName("병아리");
		dto.setAge("1");
		dto.setColor("노랑");
		
		System.out.println("Controller.add");
		dao.add();
		
		return "add";
	}
	
	@GetMapping("/view.do")
	public String view() {

		
		System.out.println("Controller.view");
		dao.view();
		
		return "view";
	}

}












