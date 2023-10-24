package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class List8{
	//원시형타입에서 참조형(XXXVO, Map)으로 제네릭을 바꾸었다.
	List<String> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
	}
	// 단 최초에는 빈통이니까 3명의 명단을 출력하려면 init() 경유시킬것 - 전처리 - 출력전에 먼저 
	boolean rankSelect(String newName) {  // 리턴타입을 void로 바꾸는 건가요? - 전역변수이자나
		boolean isOk = false;
		//insert here
		isOk = rank.add(newName);
		return isOk;
	}
	// 자료구조에 들어있는 값을 순회하는데 get(int) 메소드의 리턴타입이 Element인 것을
	// 사용자 정의 메소드를 구현하여서 굳이 리턴타입을 boolean으로 바꾸어본다.(if문 복습하기)
	// 한건조회하기 -> 조건식이 필요하니까 파라미터가 필요하고 전체 조회일댄 있는거 모두 출력이니까 파라미터가 필요없잖아.
	boolean rankDetail(int index) {
		boolean isOk = false;
		//insert here
		String name = null;
		name = rank.get(index);
		if(name!=null) {
			isOk = true;
		}
		return isOk;
	}
} 
public class ListMain8 {

	public static void main(String[] args) {
		System.out.println("전체조회 1번입력, 상세조회이면 2번 입력");
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