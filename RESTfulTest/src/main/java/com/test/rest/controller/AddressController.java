package com.test.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.dao.AddressDAO;
import com.test.rest.dto.AddressDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Delegate;
import lombok.RequiredArgsConstructor;

//@Controller
@RestController
@RequiredArgsConstructor
@Api(value = "주소 컨트롤러", description = "주소 데이터 REST API Controller")
public class AddressController {
	
	private final AddressDAO dao;
	
	//*** 요청에 반환 > 췝페이지(X), 순수 데이터(O) > JSON
//	@GetMapping("/m1.do")
//	public @ResponseBody AddressDTO m1() {
//		
//		AddressDTO dto = dao.m1();
//		
//		return dto;
//		
//	}
	
	@GetMapping("/m1.do")
	public AddressDTO m1() {
		
		AddressDTO dto = dao.m1();
		
		return dto;
		
	}
	
	//Address > CRUD > RESTful
	
	//추가 하기
	//1. http://localhost:8090/rest/address
	//2. POST
	//3. return int
	
	@ApiOperation(value = "추가하기", notes = "주소록 제이터를 추가 합니다.")
	@PostMapping("/address")
	public int add(
			@ApiParam(value = "주소록 데이터", required = true) //나머지도 이렇게 작성
			@RequestBody
			AddressDTO dto) {
		
		int result = dao.add(dto);
		
		return result;
		
	}
	
	
	//목록 보기
	//1. http://localhost:8090/rest/address
	//2. GET
	//3. List<DTO> -> JSON
	@GetMapping("/address")
	public List<AddressDTO> List(){
		
		return dao.list();
	}
	
	
	
	//수정하기
	//1. http://localhost:8090/rest/address/1
	//2. PUT
	//3. return int
	@PutMapping("/address/{seq}") //경로 변수(PathVariable)
	public int edit(@RequestBody AddressDTO dto, @PathVariable("seq") String seq) { //경로 변수 받는 방법{seq} => @PathVariable
		
		dto.setSeq(seq);
		
		return dao.edit(dto);
	}
	
	//삭제하기
	//1. http://localhost:8090/rest/address/1
	//2. delete
	//3. return int
	
	@DeleteMapping("/address/{seq}") //경로 변수(PathVariable)
	public int del(@PathVariable("seq") String seq) {

		return dao.del(seq);
	}
	
	//검색하기
	//1. http://localhost:8090/rest/address/1
	//2. GET
	//3. return DTO
	@GetMapping("/address/{seq}")
	public AddressDTO get(@PathVariable("seq") String seq) {
		
		return dao.get(seq);
	}
	
	
}



















