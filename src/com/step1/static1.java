package com.step1;

public class static1 {
	// 아래 변수 선언 3가지는 모두 원시형 타입이라서 변수를 호출하면 값이 출력됨
	// 참조 변수는 호출하면 주소번지가 출력됨
	int i = 1;
	static int j = 2;
	public double d = 0.5;	
	
	public void methodA() {  // static이 없기 때문에 호출할 땐 s.methodA로 적어야한다.
		System.out.println("methodA호출 성공");
	}
	public static void methodB() {
		System.out.println("methodB호출 성공");		
	}
	public static void main(String[] args) {
		static1 s = new static1();
		System.out.println(s.i);
		// 변수 i선언시 static을 붙였으므로 인스턴스 변수 없이도 직접 호출이 가능함. //i
		System.out.println(j); 
		// j는 인스턴스화 없이도 호출이 가능함 //2
		System.out.println(s.d);
		s.methodA();
		methodB();
	}
}
