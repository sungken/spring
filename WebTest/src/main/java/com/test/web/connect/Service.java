package com.test.web.connect;

public class Service {
	
	public void work() {
		
		//클래스를 사용한 관계 > 강한 결합
		//인터페이스를 사용한 관계 > 느슨한 결합(계층과 계층의 결합에서는 선호해서 쓴다.)
		
		//Hong worker = new Hong();

		//Lee worker = new Lee();
		
		Worker worker = new Hong();
//		Worker worker = new Lee();
		
		String thing = worker.get("마우스");
		System.out.println(thing);
		
	}
	
}
