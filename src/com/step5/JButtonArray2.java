package com.step5;

import javax.swing.JButton;

public class JButtonArray2 {

	public static void main(String[] args) {
		//초기화를 하지  않으면 주소번지를 출력하지 못하고 null만 세번 출력한다.
		JButton jbtns[] = new JButton[3];//null, null, null
		JButton jbtnSelect = new JButton("조회");
		System.out.println(jbtns[0]);//null
		jbtns[0] = jbtnSelect;
		System.out.println(jbtns[0]);//@abcd1234
	}

}
