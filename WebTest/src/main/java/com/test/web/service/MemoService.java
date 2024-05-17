package com.test.web.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Qualifier("memo") //- 잘 사용하지 않는다.
@Primary
public class MemoService implements DataService {
	
	@Override
	public void add(String message) {
		System.out.println("메모: " + message);		
	}

}
