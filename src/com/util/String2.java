package com.util;
// String - 원본이 바뀌지 않는다.
// 같은 이름의 두 개의 객체를 생성해서 처리함 - 문제제기

public class String2 {

	public static void main(String[] args) {
		String sql = "SELECT deptno";
		System.out.println(sql);
		sql += "dname, loc FROM dept";
		System.out.println(sql);
		String s = "hello";
		System.out.println(s.replace('e', 'o'));
				

	}

}
