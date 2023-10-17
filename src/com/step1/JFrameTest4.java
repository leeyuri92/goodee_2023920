package com.step1;
import javax.swing.JFrame;
// 이름 지어진 소스이름과 선언된 클래스이름이 다르다.
public class JFrameTest4 { // 클래스 선언하기 {}
	static JFrame j4 = new JFrame();	 
	public static void main(String[] args) {
		// jft는 지역변수이다.
		// 메소드 {}에서 선언된 변수는 모두 지변의 성격이다.
		JFrameTest3 jft = new JFrameTest3();
		jft.j3.setTitle("난 3번이야");
		jft.j3.setSize(500, 400);
		jft.j3.setVisible(true);
		j4.setTitle("난 4번이야");
		j4.setSize(500, 400);
		j4.setVisible(true);
	}
}

/*
 * 지역변수는 
 * 윈도우 창이 왜 두개가 뜰까?
 * 인스턴스화가 두 번 일어나서
 * JFrameTest4 클래스에 선언된 메인메소드가 호출되었다???
 * 그 안에서 JFrameTest3을 인스턴스화
 * 결론 : 내가 구현한 메소드가 아니더라도 그 메소드를 소유하고 있는 클래스를 인스턴스화 하면
        그 클래스의 메소드를 나는 호출할 수 있다.
 */