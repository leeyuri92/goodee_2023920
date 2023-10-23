package com.step4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ELogic{
	
}
class EEvent implements ActionListener{
	EView eView = null;
	//파라미터 자리에 선언된 변수는 지변이다.
	public EEvent(EView eView) {//파라미터가 있는 생성자는 자동으로 만들어주지 않는다.
		System.out.println("생성자 호출");
		System.out.println(eView);//메소드 파라미터 지변
		this.eView = eView;
		System.out.println(this.eView);//전변
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(eView);
		
	}
	
}
public class EView {
	public static void main(String[] args) {
		EView ev = new EView();
		System.out.println(ev);
		EEvent ee = new EEvent(ev);
		System.out.println("main호출");

	}

}
