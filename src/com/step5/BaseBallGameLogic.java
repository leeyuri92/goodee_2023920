package com.step5;

import java.util.Random;
//게임에 관련된 규칙이나 약속들 - 로직클래스 배치하자
public class BaseBallGameLogic {
	// 현재는 null이므로 NullPointerException이지만 생성자를 통해 해결	
	BaseBallGameUI baseBallGameUI = null;
	
	int my[]  = new int[3];
	int com[] = new int[3];//컴터가 채번한 숫자 담기 -BaseBallGameUI or BaseBallGameLogic or BaseBallGameEvent	
	// 단 이와같은 방법을 사용할 때 순환구조에 빠지지 않도록 주의할 것 - 제어역행
	public BaseBallGameLogic(BaseBallGameUI baseBallGameUI) {
		this.baseBallGameUI = baseBallGameUI;		
	}
	
	//세자리 임의의 숫자를 채번하는 메소드 구현하기
	public void ranCom() {
		Random r = new Random();
		//첫번째 자리는 중복검사가 필요없다
		com[0] = r.nextInt(10);
		//while문과는 다르게 무조건 한번은 실행됨
		do {
			com[1] = r.nextInt(10);			
		}while(com[0]==com[1]);//중복된 숫자이면 계속 돌아라
		do {
			com[2] = r.nextInt(10);			
		}while((com[0]==com[2]) || (com[2]==com[1]));//중복된 숫자이면 계속 돌아라
	}
	//사용자가 입력한 값을 판정하는 메소드를 구현해 봅시다.
	public String account(String user) {
		if(user.length()!=3) {//length명사형은 배열의 원소의 수반환. length()동사형은 문자열의 길이를 반환함
			return "세자리 숫자를 입력하세요.";
		}
		//사용자가 jtf_user에 입력한 숫자는 보기에는 숫자 처럼 보여도 알맹이는 문자열로 
		//인식을 합니다. 그래서 형전환을 한 후 my[]배열에 담아야 함니다.
		//문자열 "256"을 숫자로 담을 변수 선언
		int temp 	= 0;
		int strike 	= 0;//힌트로 사용될 스트라이크를 담을 변수 선언
		int ball 	= 0;//볼을 담을 변수 선언
		//strike와ball을 지역변수로 해야 하는건 매 회차 마다 값이 변해야 하기 때문이다.
		try {
			temp = Integer.parseInt(user);//안녕 - NumberFormatException발생
		} catch (NumberFormatException e) {
			return "숫자만 입력하세요.";
		}
		my[0] = temp/100;//256/100=> 2.56 -> 2만 담김
		my[1] = (temp%100)/10;//십의자리 - 몫 2 나머지 56-> 5.6 -> 5만 담김
		my[2] = temp%10;//몫: 25 - 6만담김
		//이 중 for 문 사용해서 자리는 다르더라도 그 숫자가 존재하니? 네-> ball확보됨
		//네 일때 다시 한번 i ==j가 같은지  비교해서 index값 마저도 동일하면 자리까지도 일치함 - strike++
		for(int i=0;i<3;i++) {//9가지 경우의 수가 발생
			for(int j=0;j<3;j++) {
				if(com[i] == my[j]) {//그 숫자가 존재하니? 네 -ball확보
					if(i==j) {//자리값도 일치하는 거야? 네 -strike결정됨
						strike++;
					}else {//숫자는 있지만 자리는 달라요
						ball++;
					}
				}//end of if
			}/// end of inner for
		}//////end of outter for
		if(strike == 3) {
			return "정답입니다. 축하합니다.";
		}
		return strike+"스  "+ball+"볼";
	}
}