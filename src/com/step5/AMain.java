package com.step5;
class A1{
	int i;
	public A1() {
		
	}
	public A1(AMain aMain) {
		System.out.println("A1에서 출력한 AMain원본: " + aMain);
	}
	// 경유한다 - 실행문(초기화, 재정의, if문 - 흐름이 바뀐다)
}
class A2{
	public A2() {
		
	}
	public A2(AMain aMain) {
		System.out.println("A2에서 출력한 AMain원본: " + aMain);
	}
	public void methodA() {
		System.out.println("methodA 호출");
	}
}

public class AMain {
	A1 a1 = new A1(this); // Amain의 원본그대로 보내기 위해 만들어놈
	A2 a2 = new A2(this);
	public static void main(String[] args) {
		// static내부에서는 this나 super예약어는 불가함
		AMain am = new AMain(); // 생성자호출 -> 전변의 초기화 -> 생성자 경유
		// 파라미터를 갖는 생성자가 하나라도 존재하면 디폴트 생성자도 마저도 제공안됨
		A1 a1 = new A1();
		System.out.println(a1.i);
		A2 a2 = new A2();
		a2.methodA();
		

	}

}
