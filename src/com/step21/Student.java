package com.step21;

public class Student {
	int html 	= 0;
	int css 	= 0;
	int java 	= 0;
	public static void main(String[] args) {
		Student s = new Student();
		s.html = 70;
		s.css = 80;
		s.java = 90;
		System.out.println(s); // com.step21.Student@2f4d3709
		
		s = new Student();
		s.html = 60;
		s.css = 70;
		s.java = 80;		
		System.out.println(s); // com.step21.Student@4e50df2e
		
		s = new Student();
		s.html = 50;
		s.css = 60;
		s.java = 70;		
		System.out.println(s); // com.step21.Student@1d81eb93
		
		// 같은 타입의 클래스를 인스턴스화 할때마다 서로 다른 전역변수의 값을 관리할 수 있다.
	}
}