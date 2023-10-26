package bclass.board;

import javax.swing.JButton;

public class EMain extends Object{
	
	public String toString() {
		return "참나";
		
	}

	public static void main(String[] args) {
		EMain em = new EMain();
		JButton jbtn = new JButton("조회");
		System.out.println(em);
		System.out.println(em.toString());
		System.out.println(jbtn);		

	}

}
