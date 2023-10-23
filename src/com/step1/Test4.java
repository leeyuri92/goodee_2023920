package com.step1;

public class Test4 {	
	// 메인메소드는 콜백이라서 개발자가 호출할 수 없다.
	public static void main(String[] args) {
		Test2 t2 = new Test2(); // 인스턴스화
		t2.methodC();
		// 위 코드에서 methodC를 경유하였으므로 P클래스의 정적변수 i는
		// 1에서 3으로 변경됨
		
		t2 = new Test2();
		t2.methodC(); 
		// 위 코드에서 methodC를 경유하였으므로 P클래스의 정적변수 i는
		// 1에서 3으로 변경됨
		System.out.println(P.i); // 1 -> 3 -> 5
			}
}
/*
 static은 클래스 급이라서 인스턴스화 없이 호출이 가능하다 
 */