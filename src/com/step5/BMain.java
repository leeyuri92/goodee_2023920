package com.step5;
// 자바를 자바답게 코딩하기 - 재사용성과 이식성
// 효과적으로 코딩을 전개하기 - 추상 클래스와 인터페이스 설계하고 구현해 나가기
// 클래스 사이의 결합도를 낮춰서 단위테스트 > 통합테스트

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class B1{
	JButton jbtnSelect = new JButton("조회");
}
class B2{
	JButton jbtninsert = new JButton("입력");	
}
public class BMain implements ActionListener{
	JFrame jf = new javax.swing.JFrame();
	B1 b1 = new B1(); // 위치, 유지(쿠키(로컬에 산다),세션(서버:캐쉬메모리) - 시간을 지배)
	B2 b2 = null; // 선언만
	
	BMain(){
		b2 = new B2(); // 생성은 여기서 - 경유한다.
//		for(double d=0.0;d<999999.0;d++) {
//			System.out.println("지연");			
//		}
		initDisplay();
	}
	
	public void initDisplay() {
		// 이벤트 소스와 이벤트 처리를 담당하는 클래스 연결하기 
		// - 콜백메소드 (시스템이 자동으로 호출함- 시점 결정권 개발자에게 없다) 호출됨
		// 주소번지를 두 번 접근해야 처리가 가능한 경우 -> 이차배열, 객체배열, List<Dept>
		b1.jbtnSelect.addActionListener(this);
		jf.add("North", b1.jbtnSelect);
		jf.add("South", b2.jbtninsert);
		jf.setSize(500, 400);
		jf.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		BMain bm = new BMain();

	}

	@Override  // 이벤트 처리하는 엑션퍼펌즈가 생겻다
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==b1.jbtnSelect) {
			System.out.println(b1.jbtnSelect.getText());
		}
	}

}
