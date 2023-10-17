package com.step6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;

import com.google.gson.Gson;

/*
 *  업무요청에 대한 결과가 조인이 불가피 할때 하나의 클래스로 제네릭을 사용 할 수 없다.
 *  Map 인터페이스를 사용하는 것이 효과적임 - 키와 값으로 관리함
 *  키를 컬럼명으로 통일하면 일관성있는 변수명으로 접근이 가능하다. - 속도도 빠르다
 */
class Emp1{
	private int empno = 0;
	private String ename = null;	
}
class Dept1{
	private String dname = null;
}

public class AddList {

	public static void main(String[] args) {
		JButton jbtnSelect = new JButton();
		// 선언부와 생성부의 이름이 다르면 다형성을 누릴 수 있다.
		// 다형성에 대한 전제조건이다.
		// 재사용성을 높인다, 이식성을 좋게 함,  유연하다
		// 기존의 코드를 변경해야한다. - 있는걸 바꾼다 - 사이드이펙트(부수효과)
		// 이식성, 재사용성 - 객체지향 언어가 추구하는 방향성
		// 전역변수 - 클래스 중심의 코딩을 전개하기 - 중요함 - 유지됨 - 람다식과 같은 함수형에서는 사용하지 않는다. - 왜냐면 사이드이펙트
		// 지역변수 - 처리하면 그 메소드 안에서만 유지됨 - 사이드이펙트 발생하지않음
		// 안전함 - 람다식 - 함수형 크로그래밍 지원 가능한 이유
		// 인터페이스, 추상클래스 변수명 = new 구현체 클래스();
		List<JButton> li = new ArrayList<>();
		// List 인터페이스의 구현체 클래스가 ArrayList이다.
		// 인터페이스는 단독으로 인스턴스화를 할 수 없다.
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("empno", 7782);
		map.put("ename", "CLARK");
		map.put("dname", "ACCOUNTING");
		list.add(map);
		System.out.println(list);
		Gson g = new Gson();
		String temp = g.toJson(list);
		System.out.println(temp);
		
		
		

	}

}
