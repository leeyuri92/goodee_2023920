package com.List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListmethodC{
	List<String> rank = new ArrayList<>();
	
	void init() {
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
	}
	
	boolean rankDelete(String dele) {
		boolean isOK = false;
		isOK = rank.remove(dele);
		return isOK;
	}	
}

public class List3 {

	public static void main(String[] args) {
		System.out.println("삭제하고자 하는 값을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		
		ListmethodC lmC = new ListmethodC();
		lmC.init();
		boolean isOK = lmC.rankDelete(value);
		
		if(isOK) {
			System.out.println("삭제되었습니다.  ===> " + lmC.rank);
		}else {
			System.out.println("삭제에 실패하였습니다.");
		}
	}
}
