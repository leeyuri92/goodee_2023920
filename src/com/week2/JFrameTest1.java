package com.week2;

import javax.swing.JFrame;

public class JFrameTest1 extends JFrame {
	// 파라미터가 한개도 없으니까 JVM이 대신 만들어줄 수 있다.
	// 파라미터가 있으면 만들어 줄 수 없다. -JVM이 임의로 정하면 안되니까..
	public JFrameTest1() { // 파라미터가 없는 생성자를 디폴트 생성자라고 한다.
		System.out.println("디폴트 생성자 호출");
		// 생성자 안에서는 static이 없어도 인스턴스 변수 없이도 사용 가능
		initDisplay();   
		// methodA();    메소드 이름은 같아도 파라미터의 갯수가 달라서 다른메소드로 인지
	}
	// 사용자 메소드 정의하기 - 화면을 출력하는 메소드 선언해보기
	public void initDisplay() {
		System.out.println("initDisplay 호출");
		// 주로 전변과 지변의 이름이 같은 경우 구분하기 위해 개발자 명시적으로 붙여줌 - 생략하지않음
		this.setSize(500, 400); // this = 자바가 제공하는 수정자이고 보통 자기자신을 가리킬 때 사용함
		this.setVisible(true);		
	}
	public void methodA(JFrameTest1 jft) {
		System.out.println("methodA()  호출");
		System.out.println(jft);
	}
	public static void main(String[] args) {
		JFrameTest1 jft = new JFrameTest1();  
		System.out.println(jft); // 지변이지만 메소드 호출시 파라미터를 통해서 원본을 넘길 수 있다.
		// new JFrameTest1().methodA();    이렇게 작성하면 2번 호출됨  
		
		// 변수 이름이 없으면 지역변수로 선언되어 참조되는 클래스를 다른 메소드에서 재사용이 불가능
	}
}
