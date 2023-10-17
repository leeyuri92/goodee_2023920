package com.week1;

public class EmpSimulation2 {	
	
	void setEmp(Emp emp) {
		// emp = 0,null,null
		emp=new Emp(); // 같은 속성을 가진 방이 생성, 없을경우 메인에서 생성된 emp값이 재정의
		emp.empno = 7566; // 여기서부터 재정의
		emp.ename = "Smith";
		emp.job = "영업";
		System.out.println("====================[[before]]======================");
		System.out.println(emp.empno+", "+emp.ename+", "+emp.job); // 7566 Smith 영업
	}
	public static void main(String[] args) {
		EmpSimulation2 es2 = new EmpSimulation2();
		Emp emp = new Emp();
		es2.setEmp(emp);
		System.out.println("====================[[after]]=======================");
		System.out.println(emp.empno+", "+emp.ename+", "+emp.job);
	}
}
