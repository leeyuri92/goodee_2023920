package com.week3;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeView {
	//선언부 - 선언부에서는 메소드 호출 불가함
	JFrame jf = new JFrame();
	Font font = new Font("돋움체",Font.BOLD,30);
	JLabel jlbTime = new JLabel("현재시간정보", JLabel.CENTER);
	//TimeClient tc = new TimeClient(jlbTime);
	/*
	실제 현재 시간 정보를 청취하는 TimeClient클래스에서 TimeView JLabel과 JFrame 모두 접근할 수 있어야 함
	따라서 this를 파라미터값에 넣어서 넘긴다.
	여기서 this는 TimeView임. 이를 받으면 전변 모두를 넘겨받을 수 있음.
	TimeView에서 생성된 화면이지면 TimeClient에서 사용하겠다면
	생성자의 파라미터에 this(TimeView)를 넘길 수 있음. 
	 */
	TimeClient tc = new TimeClient(this); //this로 넘겨야 JLabel과 JFrame둘 다 접근할 수 있음. 
	//생성자
	TimeView(){
		
	}
	public void initDisplay() {
		System.out.println("TimeView : "+jlbTime);
		tc.start();
		jlbTime.setFont(font);
		jf.add("North", jlbTime);
		jf.setSize(700, 400);
		jf.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		TimeView tv = new TimeView();
		tv.initDisplay();
	}

}