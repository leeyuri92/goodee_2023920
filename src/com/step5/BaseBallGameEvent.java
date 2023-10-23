package com.step5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseBallGameEvent implements ActionListener {
	int cnt = 0;
	BaseBallGameUI bbgUI = null;
	//아래 생성자 호출은 BaseBallGameEvent에서 일어나는게 아니고
	//BaseBallGameUI에서 생성자 호출이 일어난다.
	//그때 파라미터 자리에 this를 넣었다.- 그(BaseBallGameUI의 main메소드에서
	//인스턴스화를 통해 메모리에 로딩된 바로 그 원본이다)
	public BaseBallGameEvent(BaseBallGameUI baseBallGameUI) {
		this.bbgUI = baseBallGameUI;
	}
	//나가기 버튼이나 나가기 메뉴 아이템을 선택(클릭)했을때 호출되는 메소드 구현
	public void exit() {
		System.exit(0);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("actionPerformed 호출 성공");
		String label = e.getActionCommand();//감지된 클래스의 라벨담기
		System.out.println("너가 누른 버튼의 문자열은 "+label+ " 입니다.");
		Object obj = e.getSource(); //이벤트소스의 주소번지를 담아줌.
		System.out.println(obj);
		
		if("지우기".equals(label)) {
			bbgUI.jta_display.setText(""); // 화면측 - BaseBallGameUI
		}
		//너 나가기 버튼이니?
		//|만 있을 땐 앞에 조건이 true이면 실행문이 결정되었지만 뒤에 조건을 따짐
		//||가 있을 땐 앞에 조건이 true이면 뒤에 조건이 false이어도 어차피 실행됨 - 뒤에 조건을 안따짐- 일량이 줄어듦
		else if("나가기".equals(label) || obj == bbgUI.jmi_exit) {//or이니까 둘중 하나만 true이어도 호출된다.
			exit();//사용자 정의 메소드 호출이다.
		}
		//새게임을 누른거야?
		else if(obj == bbgUI.jbtn_new|| obj == bbgUI.jmi_new) {
			cnt = 0;
			bbgUI.bbgLogic.ranCom();
			bbgUI.jta_display.setText("");
		}
		//이벤트가 발생한 이벤트 소스의 문자열을 비교하기
		else if(e.getSource()==bbgUI.jtf_user) {
			bbgUI.jta_display.append(++cnt+"회 : "+bbgUI.jtf_user.getText()+" : "+bbgUI.bbgLogic.account(bbgUI.jtf_user.getText())+"\n");
			bbgUI.jtf_user.setText("");
		}///////////입력하고 엔터 쳤을 때
		else if(obj==bbgUI.jmi_dap || "정답".equals(label)) {
			//1-먼저 채번(동사-기능-메소드 호출)하고 그 다음에 com배열에 있는 값을 출력해 준다.
			//ranCom();
			bbgUI.jta_display.append("정답은 "+bbgUI.bbgLogic.com[0]+bbgUI.bbgLogic.com[1]+bbgUI.bbgLogic.com[2]+" 입니다.\n");
			//jta_display.append(com[0]+com[1]+com[2]);//0
		}		
		
	}

}