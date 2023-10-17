package com.step1;

public class Test1 {
	int i =1; // 전변
	public void methodA() {
		System.out.println("methodA 호출 성공");				
		int i = 2; // 지변 - 같은 변수명 사용 가능
		i=3; // 재정의는 타입을 쓰지않다
		Test1 t1 = new Test1(); 
		// 메소드 내에서 선언된 변수는 지역변수
		// 그래서 t1이라는 같은 이름의 변수를 사용할 수 있다.
		// 인스턴스변수.전역변수
		int j;
		j=4;
		System.out.println("j====>"+j);
		System.out.println(t1.i); // 전역변수: 1
		System.out.println(i); // 지역변수 : 3
	}	
	public static void main(String[] args) {
		 Test1 t1 = new Test1();  // 인스턴스화라고 한다. t1은 인스턴스변수
		 t1.methodA();		
	}
}
/*
 메소드 선언할때도 좌중괄호와 우중괄호를 사용해서 영역을 표시한다.
 메소드를 호출할때는 세미콜론으로 끝난다*/
