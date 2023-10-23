package com.List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListmethodD{
	List<String> rank = new ArrayList<>();
	void init() {
		rank.add(0, "나신입");
		rank.add(1, "나초보");
		rank.add(2, "나일등");
	}
	
	boolean rankInsert(String name) {
		boolean isOK = false;
		isOK = rank.add(name);
		return isOK;		
	}	
}

public class List4 {

	public static void main(String[] args) {
		System.out.println("추가하고자 하는 이름을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		
		ListmethodD lmD = new ListmethodD();
		lmD.init();
		boolean isOK = lmD.rankInsert(user);
		
		if(isOK) {
			System.out.println("추가되었습니다.  ===> "+lmD.rank);
		}else {
			System.out.println("추가에 실패하였습니다.");
		}
	}
}
