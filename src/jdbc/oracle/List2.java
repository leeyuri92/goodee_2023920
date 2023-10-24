package jdbc.oracle;

import java.util.List;
import java.util.Map;

public class List2 {
	void methodA(List<BookVO> bookList) {
		// 전제 :  사용권은 나신입, 로그인 권한
		BookVO bVO = new BookVO();  // b_no, b_title, b_author, b_price - private
		//bVO.b_title = "수학의 정석";   에러 - private이라서 직접변경이 불가능하다. 
		bVO.setB_title("수학의 정석");   // set으로 가져온다.
		bVO.setB_author(null);   // set으로 가져온다.
		System.out.println(bVO.getB_title());		
		System.out.println(bVO.getB_title().length());
		System.out.println(bVO.getB_author());		
		System.out.println(bVO.getB_author().length());		
		
		//사용권 - 나 초보
		bVO = new BookVO();
		System.out.println(bVO.getB_title());
	}
	void methodB(List<Map<String, Object>> bookList) {
		
	}

	public static void main(String[] args) {
		List2 li2 = new List2();
		li2.methodA(null);
		 

	}

}
