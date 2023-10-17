package com.step5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//1차 객체 배열 연습
public class JButtonArray implements ActionListener{
	//선언부
	JFrame jf = new JFrame();
	JButton jbtns[] = new JButton[4];
	String jbtnsLabels[] = {"one","two","three","four"};
	//생성자
	JButtonArray() {
		//객체 배열 초기화 하기 - 생성자는 전변의 초기화 담당함
		for(int i=0;i<jbtns.length;i++) {//jbtns.length=4
			jbtns[i] = new JButton(jbtnsLabels[i]);
			jbtns[i].addActionListener(this);
		}
	}
	//화면처리부
	public void initDisplay() {
		jf.setLayout(new GridLayout(1,4));
		for(int i=0;i<jbtns.length;i++) {
			jf.add(jbtns[i]);
		}
		jf.setTitle("객체 배열 연습1");
		jf.setSize(500, 300);
		jf.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		JButtonArray ja = new JButtonArray();
		ja.initDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
