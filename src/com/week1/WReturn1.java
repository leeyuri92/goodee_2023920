package com.week1;
// 메소드 선언 문장
// (접근제한자 - 생략가능) 리턴타입 메소드이름(파라미터1, 2, ...)

public class WReturn1 {
	void methodA() {
		
	}
	int methodB() {
		return 1;
	}
	// return 다음에 오는 코드는 반드시 타입을 맞춰야 함
	// 하나만 반화할 수 있다.
	// 만일 여러개의 값을 반환하고 싶다면 참조형 타입을 사용하면 된다(1-3)
	public static void main(String[] args) {
		WReturn1 wr = new WReturn1();
		int i = wr.methodB();
		System.out.println(i);
		// j = wr.methodA();    -  return이 없어서 에러

	}

}
