package com.test.aop.singleton;


//객체 단 1개만 구현 > 싱글톤 패턴***
public class DAO {
	
	private static DAO obj;
	
	private DAO() {}; // 외부에서 객체를 직접 생성하지 못하게 만들기
	
	//프로세스
	//- 운영체제가 1개의 프로그램을 실행하는 단위
	
	//스레드(thread) 안정성
	//- synchronized: 임계 영역 생성 하는 키워드
	
	public static synchronized DAO getInstance() {
		if (obj == null) {
			obj = new DAO(); // 
		}
		
		return obj;
	}
	
}










