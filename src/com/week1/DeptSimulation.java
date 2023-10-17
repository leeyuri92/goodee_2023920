package com.week1;

public class DeptSimulation {

	public static void main(String[] args) {
		Dept dept = new Dept();  // 인스턴스 선언		
		dept.deptno = 20; 
		dept.dname = "개발부";
		dept.loc = "서울";		
		System.out.println(dept.deptno + ", " + dept.dname + ", " + dept.loc); 
		System.out.println(dept);		
	
		dept = new Dept(); // 재정의
		dept.deptno = 30; 
		dept.dname = "운영부";
		dept.loc = "대전";		
		System.out.println(dept.deptno + ", " + dept.dname + ", " + dept.loc); 
		System.out.println(dept);	
		
		dept = new Dept();		
		dept.deptno = 40; 
		dept.dname = "기획";
		dept.loc = "제주";
		System.out.println(dept.deptno + ", " + dept.dname + ", " + dept.loc); 
		System.out.println(dept);		
	}
}
/*
6번 라인만 선언이고요 8번과 10번은 선언이 아닙니다.
같은 이름의 변수 이더라도 new를 사용해서 인스턴스화를 하면 새로운 객체가 만들어진다.
이때 변수가 세개 정의되어 있으므로 Dept클래스 선언시 주었던 초기값을 디폴트 값으로 
기억하고 있다.
 */
