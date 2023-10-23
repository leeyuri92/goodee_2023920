package com.step5;

import java.util.ArrayList;
import java.util.List;

public class List4 {
	List<DeptDTO> li = new ArrayList<>(); // 확장성, 유지보수할때 코드 수정양을 줄여줌

	public static void main(String[] args) {
		List4 l4 = new List4();
		DeptDTO dept = new DeptDTO();
		dept.setDeptno(10);
		dept.setDname("영업부");
		dept.setLoc("부산");
		l4.li.add(dept);
		
		dept = new DeptDTO();
		dept.setDeptno(20);
		dept.setDname("개발부");
		dept.setLoc("대전");
		l4.li.add(dept);
		
		System.out.println(l4.li);
		DeptDTO rd = l4.li.get(0);
		System.out.println(rd);
		System.out.println(rd.getDeptno()+", "+ rd.getDname() +", "+ rd.getLoc() );
		rd = l4.li.get(1);
		System.out.println(rd.getDeptno()+", "+ rd.getDname() +", "+ rd.getLoc() );
		

	}

}
