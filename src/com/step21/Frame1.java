package com.step21;

import javax.swing.JFrame;

public class Frame1 {
	JFrame jf = new JFrame();
	void initDisplay() {
		jf.setSize(500,400);  // 상수를 사용해서 별로다
		jf.setVisible(true);   // true가 상수이다.
	}
	void initDisplay(int width, int height) { // 메소드의 파라미터 자리는 호출될 때 결정된다.
		jf.setSize(width, height);
		jf.setVisible(true); // 상수를 사용했기 때문에 앱이라면 음악을 듣는 중에 전화가 들어오는 상황을 상상해 보면
		// 기능구현이 어렵다.		
	}
	void initDisplay(int width, int height, boolean isView) {
		jf.setSize(width, height);  
		jf.setVisible(isView);   		
	}
	public static void main(String[] args) {
		Frame1 f = new Frame1();
		f.initDisplay(500, 400,false); // call by value = 값에 의한 호출이다.
		//호출될 때 지역변수가 초기화된다.
	}
}
