package com.test.web.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service  // bean으로 만들어 주기(스프링 빈)
@RequiredArgsConstructor
public class BoardService implements DataService {

	public void add(String message) {
		System.out.println(message);
	}
	
}










































