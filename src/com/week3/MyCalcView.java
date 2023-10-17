package com.week3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalcView {
	// 선언부
	MyCalcLogic mcLogic = new MyCalcLogic(this);   // Logic 연동 - (this)는 복제가 아닌 원본을 가져온다는 의미 
	MyCalcEvent mcEvent = new MyCalcEvent(this);  // Event 연동
	
	JFrame jf = new JFrame();  // 창 선언
	JTextField jtf_display = new JTextField("0");  // 입력창 선언
	JPanel jp = new JPanel(); // 판넬 선언
	
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");
	JButton jbtnClear = new JButton("C");	
	
	// 생성자	
	
	// 사용자메소드
    public void initDisplay() {
		
		// 입력창 오른쪽 정렬
		jtf_display.setHorizontalAlignment(JTextField.RIGHT);
		
		// 버튼 추가
		jbtnOne.addActionListener(mcEvent);
		jbtnTwo.addActionListener(mcEvent);
		jbtnPlus.addActionListener(mcEvent);
		jbtnEqual.addActionListener(mcEvent);
		jbtnBack.addActionListener(mcEvent);
		jbtnClear.addActionListener(mcEvent);
		
		// 판넬 추가
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jp.add(jbtnClear);
		
		// 창 위치,크기
		jf.add("North",jtf_display);
		jf.add("Center",jp);
		jf.setSize(400, 400);
		jf.setVisible(true);
	}	
	
	// 메인메소드
	public static void main(String[] args) {
		MyCalcView mcView = new MyCalcView();
		mcView.initDisplay();
	}
}
