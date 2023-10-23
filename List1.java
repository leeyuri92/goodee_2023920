package com.List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class ListmethodA{
	List<Integer> rank = new ArrayList<>();
	void init() {
		rank.add(1);
		rank.add(2);
		rank.add(3);		
	}
	boolean rankUpdate(int index, int value) {
		boolean isOK = false;
		Integer change = rank.set(index, value);
		int a = change;
		System.out.println(a + ", " + value);
		
		if(change != null) {
			isOK = true;			
		}
		return isOK;		
	}
}

public class List1 {

	public static void main(String[] args) {
		System.out.println("수정하고자 하는 위치값과 숫자를 입력하시오. 예) 위치 값, 변경할 값 ");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();  // 입력받은 값을 저장
		StringTokenizer st = new StringTokenizer(user,",");  // 문장 , 구분할 문자
		String frist = st.nextToken();
		String second = st.nextToken();
		int f = Integer.parseInt(frist);
		int s = Integer.parseInt(second);
		
		ListmethodA lm = new ListmethodA();
		lm.init();
		boolean isOK = lm.rankUpdate(f, s);
		if(isOK) {			
			System.out.println("수정되었습니다.  ==>  " + lm.rank);			
		}else {
			System.out.println("수정에 실패하였습니다.");
		}
	}
}
