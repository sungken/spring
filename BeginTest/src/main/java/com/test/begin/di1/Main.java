package com.test.begin.di1;

public class Main {

	public static void main(String[] args) {
		
		// 목적] Hong에게 일을 시키자!!
		//Main > Hong (X) 바로 접근하지 않고
		//Main > Service > Hong (O) 서비스를 거쳐서 접근하기
		
		
		//Hong hong = new Hong(); 바로 접근하지 않는다.
		
		//Main > (위임) > Service > (위임) > Hong
		//Main <-> (의존관계) <-> Service <-> (의존관계) > Hong
		//Main > Service(의존객체)
		// ***** 필요할 때마다 직접(***) 의존 객체를 생성해거 사용하는 방식을 사용해 왔다. *****
		
		
		Service service = new Service();
		service.work();
		
		
		
		
	}

}
