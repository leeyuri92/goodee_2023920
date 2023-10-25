package bclass.board;
// 메소드를 선언할 수 있다는 건 리턴타입과 파라미터를 결정할 수 있어야한다.
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 입력 수정 삭제 조회 상세보기
// 입력, 수정, 삭제 - return int로 한다. 파라미터는 BoardVO로 한다.
// 전체조회 - List<BoardVO>, List<Map>
// 추출한 데이터를 가지고 연산처리를 할 경우 타입체크가 필수이므로 이런 경우는 VO제네릭으로 한다.
// 왜 오라클서버 연동하는 클래스를 추가로 설계하였나
// JDBC API(반복되는 코드가 늘어남) - 업무에 대한 규칙이 바뀌면 코드를 수정해야함
// 반복되는 코드를 줄여주는 그러나 쿼리문은 남아있는

public class FMain {
	
	// 입력 처리
	/******************************************************************************************
	 * INSERT INTO 테이블명(컬럼명1,컬럼명2..) VALUES(?,?,?,?,?,?,?,?)
	 * 쿼리문을 자바코드에 왜 적었니?
	 * 파라미터 자리를 결정할 수 있다. 갯수,타입,컬럼명...
	 * @param BoardVO
	 ******************************************************************************************/
	// public int boardInsert(Map<String, Object> pmap) 으로도 해보기 
	public int boardInsert(BoardVO bVO) {
		int result = -1;
		// 커미해야된다면서요? - 디폴트값이 autocommit으로 설정됨
		// con.setAutocommit(true);
		// con.commit();
		return result;
	}
	
	// 수정 처리
	/******************************************************************************************
	 * update dept set dname =:dname, loc =:loc where deptno=:deptno;
	 * 쿼리문을 자바코드에 왜 적었니?
	 * 파라미터 자리를 결정할 수 있다. 갯수,타입,컬럼명...
	 * @param BoardVO
	 ******************************************************************************************/
	public int boardUpdate(BoardVO bVO) {
		int result = -1;
		return result;
	}
	// 삭제 처리
	/******************************************************************************************
	 * DELETE FROM freeboard where fb_no=?;
	 * 쿼리문을 자바코드에 왜 적었니?
	 * 파라미터 자리를 결정할 수 있다. 갯수,타입,컬럼명...
	 * @param args
	 ******************************************************************************************/
	public int boardDelete(int fb_no) {
		int result = -1;
		return result;
	}
	
	// 전체 조회 처리
	/******************************************************************************************
	 * SELECT 블라블라 FROM freeboard
	 * WHERE fb_title Like ?||'%'
	 * AND(OR) fb_date LIKE ?
	 * AND(OR) fb_writer LIKE ?
	 * 쿼리문을 자바코드에 왜 적었니?
	 * 파라미터 자리를 결정할 수 있다. 갯수,타입,컬럼명...
	 * @param args
	 ******************************************************************************************/
	//public List<BoardVO> boardListAll(Map<String, Object> pmap) {
	public List<BoardVO> boardListAll(BoardVO pbVO) {
		List<BoardVO> bList = new ArrayList<>();
		return  bList ;
	}
	// 상세 조회 처리
	/******************************************************************************************
	 * SELECT 블라블라 FROM freeboard
	 * WHERE fb_title Like ?||'%'
	 * AND(OR) fb_date LIKE ?
	 * AND(OR) fb_writer LIKE ?
	 * 쿼리문을 자바코드에 왜 적었니?
	 * 파라미터 자리를 결정할 수 있다. 갯수,타입,컬럼명...
	 * @param args
	 ******************************************************************************************/
	// public Map<BoardVO> boardList() {
	public BoardVO boardList() {
		BoardVO rbVO = null;
		return rbVO;
		
	}

	public static void main(String[] args) {

	}

}
