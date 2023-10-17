package com.step6;
// 다형성
// 같은 메소드를 호출했는데 그 결과가 달라진다.
// me.methodB(), sup1.methodB()
public class Me2 extends Super2 {
	@Override
	public void methodC() {
		System.out.println("Me2 : methodC() 호출");
	}	
	public static void main(String[] args) {
		Me2 me = new Me2();
		Super2 sup1 = new Me2();  // 앞 쪽에 상위클래스를 넣을 수 있다.(다형성)
		Super2 sup11 = new Super2();
		// sup1.methodC(); - error : 상위 클래스 타입의 인스턴스 변수로 하위 클래스에 정의된 메소드 호출 불가
		// sup11.methodC(); - error : 호출불가
		System.out.println(me.a);
		// Me2타입은 Super2만 상속받았지만 그 전에 Super1을 상속받고 있으므로 Super1에서 정의된 메소드 호출 합법
		me.methodA();
		sup1.methodA();
		// 만약 오버라이딩 관계에 있어도 불가능한 것인가?
		sup1.methodC();
		sup11.methodC();
		me.methodC();
	}
}
