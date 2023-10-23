package com.week1;
// Account클래스는 사용자로부터 임의의 두 수를 입력받아서
// 두 수의 합을 구하는 메소드를 구현하기 위해 설계되었다.
class Account{
	int first = 1;
	int second = 2;
	// 파라미터를 사용하지 않고 계산결과를 구하려면 전변을 사용해야 한다.
	public void hap1() {
		System.out.println(first+second);
	}
	public void hap2(int first, int second) { // 두 수를 파라미터로 받아서 계산하므로 지변으로 가능, 파라미터자리에서 초기화는 불가
		System.out.println(first+second); // 4, 만약 초기화가 되어 있지 않다면 0이 출력(지변은 초기화 필수)
		// int first = 0;   - 이렇게 초기화하면 에러 : 파라미터자리에서 선언이 되어있어서 안됨(중복 불가)
		first = 0;
		second = 1;  // int 제외하고 변수명만 입력하여 초기화 진행
		System.out.println(first+second); // 1 	
	}
}
public class AccountSimulation {

	public static void main(String[] args) {
		AccountSimulation as = new AccountSimulation();
		Account ac = new Account();
		ac.hap2(1, 3);	
		ac.hap1();		
	}
}

	