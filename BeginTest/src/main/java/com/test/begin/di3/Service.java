package com.test.begin.di3;

public class Service {
	
	
	private Hong hong;
	
	// 
	public Service(Hong hong) {
		this.hong = hong;
	}
	
	
//	// setter > 의존 주입 도구
//	public void setHong(Hong hong) {
//		this.hong = hong;
//	}
	
	
	public void work() {
		
		hong.coding();
		
		
	}
	

}
