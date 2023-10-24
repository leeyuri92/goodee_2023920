package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class List7{
	//원시형타입에서 참조형(XXXVO, Map)으로 제네릭을 바꾸었다.
	List<String> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
	}
	boolean rankInsert(String newName) {
		boolean isOk = false;
		//insert here
		isOk = rank.add(newName);
		return isOk;
	}
} 
public class ListMain7 {

	public static void main(String[] args) {
		System.out.println("추가하고자 하는 이름을 입력하시오.");
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
		String value = sc.nextLine();
		List7 l4 = new List7();
		l4.init();
		boolean isOk = l4.rankInsert(value);
		if(isOk) {
			System.out.println("추가 처리되었습니다.");
			System.out.println(l4.rank);//[1,2,3] ->  1|3 -> [1,3,3]
		}
		else System.out.println("추가 실패하였습니다.");
	}
}