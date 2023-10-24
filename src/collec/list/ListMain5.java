package collec.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class List5{
	//원시형타입에서 참조형(XXXVO, Map)으로 제네릭을 바꾸었다.
	List<String> rank = new ArrayList<>();//rank.size()=0
	void init() {//전역변수의 선언된 깡통에 3가지 정보를 추가하기
		rank.add(0,"나신입");
		rank.add(1,"나초보");
		rank.add(2,"나일등");
	}
	boolean rankUpdate(int index, String newValue) {
		boolean isOk = false;
		boolean isEqual = false;
		//oldValue: 기존에 들어있던 값을 담는 변수 선언
		//newValue: 새로 들어갈 값을 담을 변수(사용자가 입력한 이름으로 담음)
		for(int i=0;i<rank.size();i++) {
			//사용자가 입력한 인덱스의 위치값과  rank리스트의 인덱스 값이 같으면 그 자리가 변경할 위치이다.
			if(i==index) {
				String oldValue = rank.get(index);//그 때 그 위치값이 우리가 비교할 기존에 이름값이다.
				if(oldValue.equals(newValue)) {
					isEqual = true;
				}
			}////////// end of if
		}/////////////end of for
		//문제 - 기존에 값과 같은 값이면 수정처리 하지 않도록 코드를 수정하시오.
		if(isEqual) {
			System.out.println("기존 이름과 같은 이름을 입력하셨습니다. 다시 확인하세요.");
			return false;
		}else {		
			System.out.println("기존 이름과 다른 이름을 입력하셨습니다. 수정을 진행합니다.");
			String oldValue = rank.set(index, newValue);
			isOk = true;							
		}
		return isOk;
	}
}
public class ListMain5 {

	public static void main(String[] args) {
		System.out.println("수정하고자 하는 위치값과 이름을 입력하시오. 예)위치값|변경할값");
		Scanner sc = new Scanner(System.in);//화면을 그리진 않지만 화면이 갖는 효과는 누릴 수 있다.
		//2|5 -> index=2, value = 5  3|7 -> index=3, value =7
		String user = sc.nextLine();
		StringTokenizer st = new StringTokenizer(user, "|");
		String imsi = st.nextToken();
		int index = Integer.parseInt(imsi);//String -> int 바꿔줘(기능:처리:메소드 힘)
		String value = st.nextToken();
		List5 l4 = new List5();
		l4.init();
		boolean isOk = l4.rankUpdate(index, value);
		if(isOk) {
			System.out.println("수정 처리되었습니다.");
			System.out.println(l4.rank);//[1,2,3] ->  1|3 -> [1,3,3]
		}
		else System.out.println("수정 실패하였습니다.");
	}

}