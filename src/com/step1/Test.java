package com.step1;
/*
 * 전역변수 - 클래스 전역에서 사용할 수 있다
 * 지역변수 - 메소드 내부나 생성자 내부에서만 사용할 수 있다.
 * 정적변수 - 하나만 만들어져서, 하나를 가지고 여러 사람이 사용한다.
 */

public class Test {
	// 위치는 여기이다 - 전역변수를 선언하는 위치는 여기입니다.
	// 전역변수의 위치는 클래스 선언한 바로 다음이다.
	// 단 선언과 초기화를 분리해서 작성할 수 없다.
	int i; //전변은 초기화를 생략할 수 있다. - int의 디폴트값은 0이다. 결정되어 있다
	// i=10;

	public static void main(String[] args) {
		// 전변 호출할 수 있나?
		Test t= new Test();
		t.i = 5; 
		System.out.println(t.i); //0		
	}
}
