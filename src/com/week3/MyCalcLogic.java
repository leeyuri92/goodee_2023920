package com.week3;
// 업무의 프로세스를 담당하는 클래스는 상속이나 인터페이스에 대한 implements를 피한다. 
// 어떠한 추상클래스나 인터페이스도 구현하지 않는 순수하게 사용자 정의 메소드나 변수로만 구현하기 
// 모델계층은 순수하게 남겨둔다. - 재사용성, 이식성, 유지보수를 위해

public class MyCalcLogic {
	MyCalcView myCalcView = null; 
	public MyCalcLogic(MyCalcView myCalcView) {
		this.myCalcView = myCalcView;   // 뷰와 로직을 연결
	}

	/*******************************************************************************
	 * 사칙연산을 구현하기
	 * @param v1 - 연산자가 눌리기 전까지 입력된 숫자 묶음
	 * @param v2 - = 눌렸을 때  그 전가지 입력된 숫자묶음
	 * @param op - +, -, *, /
	 * @return - JTextField에 계산된 결과를 출력해야 한다. String이다. jtf_display.setText("3");
	 ******************************************************************************/	
	public String calcurate(String v1,String v2,String op) {
		double d1 = Double.parseDouble(v1);
		double d2 = Double.parseDouble(v2);
		if("+".equals(op)) {
			return String.valueOf(d1+d2);
		}
		else if("-".equals(op)) {
			return String.valueOf(d1-d2);			
		}
		else if("*".equals(op)) {
			return String.valueOf(d1*d2);		
		}
		else if("/".equals(op)) {
			return String.valueOf(d1/d2);			
		}
		else {
			return "error";		
		}		
	}
}
