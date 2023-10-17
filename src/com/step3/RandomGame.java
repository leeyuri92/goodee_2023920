package com.step3;
import java.util.Random;
import java.util.Scanner;
public class RandomGame {
	int dap = -1; // -1은 end of file 찾아도 없다
	public void newGame() { 
		Random r = new Random();
		dap = r.nextInt(10);  
	}	
	public String account(int user) { 
		System.out.println("dap : " + dap + ", user : " + user);
		String hint = null;
		if (dap == user) {
			hint = "정답입니다.";
		} else if (dap > user) {
			hint = "높여라.";
		} else if (dap < user) {
			hint = "낮춰라.";
		}
		return hint;
	}
	public void messagePrint(int user) { 
		System.out.println(account(user));		
	}
	public static void main(String[] args) {
		RandomGame rg = new RandomGame();
		rg.newGame(); 
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i = i+1) {
			System.out.println("0 ~9 사이의 값을 입력하세요.");
			int user = sc.nextInt();
			String hint = rg.account(user);
			if(hint.equals("정답입니다.")) {
				System.out.println("축하합니다.");
				break; //for 문 탈출하기
			}
			else if(hint.equals("높여라.")) {
				System.out.println("더 큰 숫자를 입력하세요.");
			}
			else if(hint.equals("낮춰라.")) {
				System.out.println("더 작은 숫자를 입력하세요.");				
			}			
		}
	}
}
/***************************************************************************************************************************
 * 판정을 내려주는 메소드 구현하기
 * @param user - 사용자가 숫자를 맞추기 위해서 입력하는 값을 담는 변수이다. - 입력할 때마다 바뀐다 - 지변
 * @return - String - 힌트를 반환한다(예시: 높여라, 낮춰라, 정답입니다. 축하합니다.)
 ***************************************************************************************************************************/	
/* 
0~ 9사이의 임의의 숫자를 채번하고
사용자로부터 숫자를 입력받아서
입력받은 숫자가 더 작으면 '힌트를 높여라'라고 출력
더 크면 '낮춰라' 라고 힌트를 주어서
5번까지만 기회를 제공해서 그 숫자를 맞추는 게임을 작성해 보시오.

새게임을 선택했을 때는 0~9사이에 새로운 숫자를 채번해야 합니다.
채번한 숫자는 dap이라는 변수에 저장을 해둡니다.
그리고 전역변수로 하는 것이 좋겠습니다.
왜냐면 그 게임을 하는 그 사람이 사용하는 동안에는 오직 하나의 객체만 사용하게 될테니까요..
*/