package aquiz.step1;
// 흐름을 바꾸는 코드 - 관심
// MVC패턴을 적용한 게시판에서 업무의 특성상 트랜잭션처리가 필요할 때
// Model 계층에서 조건에 따라 하나의 업무로 규정되어 둘다 처리되었을 때말 커밋하고
// 어느 하나라도 문제가 발생되면 모두 롤백해야 하는 경우에 그 시점을 인터셉트 할 목적으로 사용될 수 도 있다.

import java.util.Scanner;

// throw - 예외를 강제로 일으키는 경우에 사용
public class Q27_2 {
	static void m(int month) {  
		try {
			if(month < 0 || month > 11) {
				throw new Exception();
			}else {
				System.out.println("정상적인 처리를 한다.");
			}			
		} catch (Exception e) {
			System.out.println("강제로 에러 발생시킴 - 유효범위가 아니라서");
		}
	}
	public static void main(String[] args) {
		System.out.println("원하는 달을 입력하시오. ( ex) 0~11 사이의 값 ) : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		Q27_2.m(month);
	}
}
