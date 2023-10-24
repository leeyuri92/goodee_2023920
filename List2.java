package com.List1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class ListmethodB{
	List<String> rank = new ArrayList<>();
	
	void init() {
		rank.add(0, "나신입");
		rank.add(1, "나초보");
		rank.add(2, "나일등");
	}
	
	boolean rankUpdate(int index, String value) {
		boolean isOK = false;
		boolean isEqual = false;
		
		for(int i = 0; i<rank.size(); i++) {
			if(i==index) {
				String old = rank.get(index);
				if(old.equals(value)) {
					isEqual = true;
				}
			}			
		}		
		if(isEqual) {
			System.out.println("기존이름과 같은이름을 입력하셨습니다. 다시 확인하세요");
			return false;			
		}else {
			System.out.println("수정을 진행합니다.");
			String old = rank.set(index, value);
			isOK = true;
		}		
		return isOK;		
	}
	
}

public class List2 {

	public static void main(String[] args) {
		System.out.println("수정하고자 하는 위치의 값과 이름을 입력하시오.  예) 위치 값, 변경할 값 ");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(user, ",");
		String frist = st.nextToken();
		String second = st.nextToken();
		int f = Integer.parseInt(frist);
		
		ListmethodB lmB = new ListmethodB();
		lmB.init();
		boolean isOK = lmB.rankUpdate(f, second);
		
		if(isOK){
			System.out.println("수정되었습니다. ===>  "+ lmB.rank);
		}else {
			System.out.println("수정되지않았습니다.");
		}
		
		

	}

}
