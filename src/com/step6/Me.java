package com.step6;
// 다형성
// 같은 메소드를 호출했는데 그 결과가 달라진다.
// me.methodB(), sup1.methodB()
public class Me extends Super1 {
	public void methodC() {
		System.out.println("methodC() 호출");
	}	
	public static void main(String[] args) {
		Me me = new Me();
		Super1 sup1 = new Me();  // 앞 쪽에 상위클래스를 넣을 수 있다.(다형성)
		Super1 sup11 = new Super1();
		// sup1.methodC(); - error : 상위 클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드 호출 불가
		// sup11.methodC(); - error : 호출불가
		System.out.println(me.a);
		me.methodA();
		sup1.methodA();
		me.methodC();
	}

}
