package com.week2;

import javax.swing.JDialog;

public class AddressDialog {
	// 선언부
	JDialog jdg_address = new JDialog();
	// 메소드 설계를 통해서 반복되는 코드와 제어권은 AddressBook에 가지면서도
	// 그 변화된 부분은 AddressDialog에서 처리하는 방법을 알아보자.
	// 버튼이 눌리는 건 AddressBook 클래스에서 알고있다. - actionPerformed가 있음
	// 그런데 그 버튼이 눌렸을 때 AddressDialog클래스의 title값을 변경해야한다.
	// AddressBook에서 눌린 버튼의 라벨값을 set메소드의 파라미터를 통해서
	// 받아오고 setTitle메소드를 호출하여 이 문제를 해결할 수 있다.
	
	public void set(String title, boolean isView) {
		jdg_address.setTitle(title);
		jdg_address.setVisible(isView);	
		System.out.println(title + "버튼을 클릭하였습니다.");
	}
	// 화면처리부
	public void initDisplay() {
		jdg_address.setTitle(" 조회 | 입력 | 수정 ");
		jdg_address.setSize(400, 500);
		// jdg_address.setVisible(true);
	}
}
	// 메인메소드
/*
	public static void main(String[] args) {
		AddressDialog ad = new AddressDialog();
		ad.initDisplay();
	}
*/