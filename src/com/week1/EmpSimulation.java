package com.week1;

public class EmpSimulation {
	//main메소드에서 출력하던 문장을 empPrint메소드로 꺼내서 처리하시오.
	public void empPrint(Emp emp) {  // ?자리는 지역변수 자리이다. 호출될때 결정된다.
		System.out.println(emp.empno +", "+emp.ename+", "+emp.job);	
	}
	public static void main(String[] args) {
		EmpSimulation es = new EmpSimulation();
		Emp emp = new Emp();
		//System.out.println(emp.empno +", "+emp.ename+", "+emp.job);
		es.empPrint(emp);
		
		emp.empno = 7566; // 재정의 후 값을 초기화
		emp.ename = "나신입";
		emp.job = "마케팅";
		//System.out.println(emp.empno +", "+emp.ename+", "+emp.job);
		es.empPrint(emp);
	
		emp = new Emp();
		emp.empno = 7499;
		emp.ename = "나초보";
		emp.job = "매니저";
		//System.out.println(emp.empno +", "+emp.ename+", "+emp.job);		
		es.empPrint(emp);
		
		emp = new Emp();
		es.empPrint(emp);
	}
}