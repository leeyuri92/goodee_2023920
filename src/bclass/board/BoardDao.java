package bclass.board;
// DAO (Data Access Object)  영속성을 제공하는 오라클 서버와 연계하는 역할말 전담  
public class BoardDao {
	
	BoardController boardController = null;
	
	public BoardDao(BoardController boardController) {
		this.boardController = boardController;
	}

}
