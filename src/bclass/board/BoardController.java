package bclass.board;
// 화면과 로직을 분리하자

import java.util.List;
import java.util.Map;

public class BoardController {
	BoardDao bDao = new BoardDao(this);   // 전역변수
	
	public List<Map<String, Object>> getBoardList(){
		System.out.println("조회성공");
		return null;
	}

}
