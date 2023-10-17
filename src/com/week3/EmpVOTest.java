package com.week3;

public class EmpVOTest {

	public static void main(String[] args) {
		EmpVO eVOs[] = new EmpVO[3];//객체배열
		EmpVO eVO = new EmpVO(7466,"SMITH",3000);
		System.out.println(eVO);
		System.out.println(eVO.getEmpno());//7466
		eVOs[0] = eVO;
		eVO = new EmpVO(7599,"KING",4000);
		eVOs[1] = eVO;
		System.out.println(eVO.getEmpno());//7599
		eVO = new EmpVO(7398,"JAMES",5000);
		eVOs[2] = eVO;
		System.out.println(eVO);
		for(int i=0;i<eVOs.length;i++) {
			System.out.println(eVOs[i]);
		}
	}

}
