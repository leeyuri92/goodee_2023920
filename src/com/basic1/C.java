package com.basic1;

public class C {
	//전역변수는 초기화를 생략할 수 있어요 - 왜냐면 생성자가 대신 해주니까요
	//자바는 타입마다 디폴트 값을 가지고 있어서 C언어처럼 의미없는 쓰레기값이 출력되는
	//일은 없네요.
	int x;//나는 전변입니다.
	int y;
	//11번과 12번이 실행되려면 먼저 무엇을 해야 할까요?
	public static void methodA() {
		int x = 5;//나는 지변이고요
		System.out.println(x);//나는 누구일까요? 5 0
		//형 나는 0을 보고 싶어요. 어떡하죠?
		C c = new C();
		System.out.println(c.x);//0
	}
	public void methodB() {
		int x = 5; //나는 지변이고요
		//변수(전변과 지변이)이름이 같을 때 this붙여서 구분한다
		System.out.println(this.x);//나는 누구일까요? 5 0
	}
	//24-10-11-12-14-7-15-16-25(methodA호출)-27-17-18-20(출력)-21-28
	//29-30
	public static void main(String[] args) {
		C.methodA();
		//methodB를 호출해 보세요 - insert here
		C c  = new C();
		c.methodB();
	}////////////////////  end of main //////////////////////
}////////////////////////  end of C /////////////////////////
