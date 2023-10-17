package com.step1;

public class Variable2 {
	static int i = 5; // 정적변수
	//main메소드 선언은 static이 붙어있으므로 non-static타입은
	//호출이 불가하다.
	//해결방법 : 내안에 있는 변수라 하더라도 인스턴스화를 하면 접근가능하다.
	int j = 1; //정적변수가 아니라 전역변수이다

	public static void main(String[] args) {
		System.out.println(i);
		// insert here
		Variable2 a = new Variable2();
		System.out.println(a.j);

	}

}
