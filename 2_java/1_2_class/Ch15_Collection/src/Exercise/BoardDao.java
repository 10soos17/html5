package Exercise;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> bList;

	public BoardDao() {
		bList = new ArrayList<Board>();
	}

	public void setBoardList(String title, String content) {
		bList.add(new Board(title, content));
	}
	public List<Board> getBoardList() {

		return bList;
	}
}
