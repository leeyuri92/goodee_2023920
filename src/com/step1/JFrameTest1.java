package com.step1;

import javax.swing.JFrame;

// 자바에서는 디폴트 패키지 외에는 모두 패키지명을 다 적어야 하는데
// 반복되는 코드가 발생하니까 import 예약어를 지원함



public class JFrameTest1 {
	// 선언부
	// 자바가 제공하는 클래스를 호출하려면 인스턴스화를 해야한다.
	// 아래 문장을 작성하면 jf라는 변수로 그 클래스가 소유(정의된)하고 있는
	// 전역변수나 메소드를 호출할 수 있다. - 사용이라고 한다.
	JFrame j1 = new JFrame();
	// 생성자 선언
	// 코딩을 한다는 건 JVM과 소통하는 것이다. - 시나리오
	// 사용자 정의 메소드 선언
	public void initDisplay() {
		// 메소드 호출은 끝에 세미콜론을 붙인다
		// setTitle메소드의 파라미터 자리에는 문자열 타입이 와야 함
		// 이미 타입이 결정되어 있다.
		j1.setTitle("처음 만들어 보는 윈도우창");
		j1.setSize(500, 400);
		j1.setVisible(true);
		j1.setVisible(false);
		j1.setVisible(true);
	}	
	// 메인메소드 선언 - 개발자가 호출하지 않아도 제일먼저 실행됨 - 누가? JVM이 호출
	public static void main(String[] args) {
		// insert here
		// 내 안에 구현된 메소드라 하더라도 메인메소드 안에서 호출하려면 인스턴스화
		JFrameTest1 jft = new JFrameTest1(); 
		jft.initDisplay();

	}

}
/*
클래스 선언이 먼저이다
인스턴스화라는 건 메모리(RAM)에 개발자가 작성한 문서를 로딩하는 것이다.
클래스 이름에 빨간줄은 JVM이 해당 클랫 이름을 찾을 수 없을 때 표시
java폴더 아래 lang폴더에 있는 것만 찾을 수 있다.*/