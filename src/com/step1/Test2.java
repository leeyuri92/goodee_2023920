package com.step1;
class P{
	static int i=1;
	int j = 10;
}

public class Test2 {	
	public void methodC() {
		P.i = P.i +2;
	}
	public static void main(String[] args) {
		P.i = 2;
		System.out.println(P.i); // 정적변수를 호출할 때 클래명.변수
			}
}
/*
 메소드 선언할때도 좌중괄호와 우중괄호를 사용해서 영역을 표시한다.
 메소드를 호출할때는 세미콜론으로 끝난다*/
