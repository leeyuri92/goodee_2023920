package com.step4;

import javax.swing.JFrame;

class ZipcodeApp{
	//선언부
	JFrame jf = new JFrame();
	//생성자 - 생성자도 메소드 처럼 좌중괄호 우중괄호로 영역을 가짐 -  실행문(초기화, for,if포함, 연산가능함)올 수 있다.
	//생성자에서도 메소드 호출 가능하다. -> 뭐가 다르지? 아님 같은건가? - 결과, 어떤 상황일때 차이점 발견해 본다
	//선처리와 후처리 필수 파악
	ZipcodeApp(ThisMain tm){
		System.out.println(tm.i);
		for(double d=0;d<9999999999999999999999999999999999.0;d++) {
			System.out.println("커피를 내리는 시늉을 하고 있다.");//지연, 대기, 순서대로.....
		}
		//메소드 호출 순서를 정할 수 있어야 한다.(대기상태, 지연, 데드락....)
		initDisplay();		
	}
	//화면그리기
	public void initDisplay() {
		System.out.println("화면그리기");
		jf.setSize(400, 600);
		jf.setVisible(true);
	}
}
public class ThisMain {
	int i = 1;
	ThisMain(){
		
	}
	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		//insert here - initDisplay호출해 보시오.
		ZipcodeApp zc = new ZipcodeApp(tm);//spot-> static 을 사용하지 않으면서 세개의 나눠진 클래스가 한 몸처럼 움직이도록 한다
		
	}

}
