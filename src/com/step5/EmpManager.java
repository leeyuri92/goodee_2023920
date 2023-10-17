package com.step5;

import java.util.ArrayList;

public class EmpManager {
	ArrayList<EmpDTO> empList = new ArrayList<>(); // 아무것도 없다 size = 0;
	void getEmpList() {
		System.out.println(empList.size());
		EmpDTO emp = new EmpDTO();
		empList.add(0,emp);
		emp = new EmpDTO();
		empList.add(1,emp);
		
		System.out.println(empList.size());
		for(int i=0; i<empList.size();i++) {
			EmpDTO remp = empList.get(i);
			System.out.println(remp.getDeptno() + " " + remp.getEname() +" "+ remp.getHiredate());
		}
	}
	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		em.getEmpList();

	}

}
