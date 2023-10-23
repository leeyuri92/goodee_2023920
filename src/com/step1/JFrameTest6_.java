package com.step1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//자바에서는 디폴트 패키지외에는 모두 패키지명을 다 적어야 하는데
//반복되는 코드가 발생하니까 import예약어를 지원함
import javax.swing.JFrame;
//이름지어진 소스이름과 선언된 클래스이름이 다르다
public class JFrameTest6_ implements ActionListener {//클래스 선언하기 좌중괄호, 우중괄호
	static JFrameTest6_ jft = new JFrameTest6_();
	JFrame jf = new JFrame();//전변의 성격-메소드 안에 선언하지 않았다
	JButton jbtnAccount = new JButton("연산하기");
	JButton jbtnExit = new JButton("종료하기");
	//인스턴스변수.변수명으로 호출이 가능함 - > 전변
	public static void main(String[] args) {
	//내 안에 선언된 변수 이더라도 static영역안에서 non-static변수를 호출할때는
	//인스턴스화를 해야 한다.
		//해결방법은 주소번지를 두 번 접근해야만 한다.
		jft.jf.setTitle("난 5번이야");
		jft.jbtnAccount.addActionListener(jft);
		jft.jf.add("North",jft.jbtnExit);
		jft.jf.add("South",jft.jbtnAccount);
		jft.jf.setSize(500, 400); 
		jft.jf.setVisible(true);
	}
	//버튼을 누르는건 사용자이고 버튼이 눌렸는지 느끼는 건 JVM이다.
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌려진 버튼의 주소번지를 JVM으로 부터 알아낸다
		Object obj = e.getSource();//눌려진 버튼의 주소번지를 가져옴
		//오른쪽에 있는 값과 왼쪽에 있는 값이 같니? => 대입연산자를 두번 적는다 -> true or false
		//파라미터는 사용자가 입력한 값을 받아오는 자리이다.
		//실습하기 위해서 화면을(UI/UX)활용함
		if(obj == jft.jbtnAccount) {//너 연산하기 버튼 누른거야?- 조건문 - if문사용함
			System.out.println("버튼을 눌렀어요.");
		}
		
	}
}
/*
 *
 지역변수는 local variable 또는 automatic variable이라 함
 
 윈도우 창이 두 개가 열린다.
 왜지?
 인스턴스화가 두 번  일어났으니까.....
 JFrameTest4클래스에 선언된 메인메소드가 호출되었다???
 그 안에서 JFrameTest3을 인스턴스화를 하였다.
 결론 : 내가 구현한 메소드가 아니더라도 그 메소드를 소유하고 있는
 클래스를 인스턴스화 하면 그 클래스의 메소드를 나는 호출할 수 있다.
*/

