package com.step2;
// 자바에서는 같은 이름의 메소드를 여러개 구현 가능하다.
// 메소드오버로딩(==> 메소드 오버라이딩)
// 아래 코드에서 메소드 이름 3개는 모두 같다
// 다만 파라미터 갯수 이거나 타입이 다를 뿐이다.
//무조건 파라미터 갯수나 타입이 달라야 메소드 오버로딩으로 인정된다.
//갯수도 달라야 하고 동시에  타입이도 달라야 한다는 것은 아니다.
//둘 중 하나만 만족하더라도 참이다.
public class X {
	void methodA() {
		System.out.println("methodA() 호출성공");
	}
	void methodA(int i) {
		System.out.println("methodA(int i) 호출성공");		
	}
	void methodA(int i, int j) {
		System.out.println("methodA(int i, int j) 호출성공");				
	}
	public static void main(String[] args) {
		X x = new X();
		x.methodA(678,-5);
	}

}
