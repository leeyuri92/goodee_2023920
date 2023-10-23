package com.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView2 {
	//선언부
	//this -  현재 메모리에 로딩되어 있는 클래스 자신을 의미함
	CalcLogic cLogic = new CalcLogic(this);//생성자의 파라미터자리를 통해서 넘긴다.
	CalcEvent cEvent = new CalcEvent(this);//
	JFrame jf = new JFrame();
	JTextField jtf_display = new JTextField("0");
	JPanel jp = new JPanel();	
	//위치를 선택하는 기준이 있나요?
	JButton jbtnOne = new JButton("1");
	JButton jbtnTwo = new JButton("2");
	JButton jbtnPlus = new JButton("+");
	JButton jbtnEqual = new JButton("=");
	JButton jbtnBack = new JButton("<=");	
	//생성자
	CalcView2(){}
	//화면처리부
	public void initDisplay() {
		jbtnOne.addActionListener(cEvent);
		jbtnTwo.addActionListener(cEvent);
		jbtnPlus.addActionListener(cEvent);
		jbtnEqual.addActionListener(cEvent);
		jbtnBack.addActionListener(cEvent);		
		jp.add(jbtnOne);
		jp.add(jbtnTwo);
		jp.add(jbtnPlus);
		jp.add(jbtnEqual);
		jp.add(jbtnBack);
		jf.add("North",jtf_display);
		jf.add("Center",jp);		
		jf.setSize(400, 400);
		jf.setVisible(true);//true이면 활성화, false이면 비활성화 - 둘다 메모리에 살아있다
	}
	//메인메소드
	public static void main(String[] args) {
		CalcView2 cv = new CalcView2();
		cv.initDisplay();
	}
}
