package Exercise;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		dao.setBoardList("title1","content1");
		dao.setBoardList("title2","content2");
		
		
		List<Board> list = dao.getBoardList();
		
		for(Board b : list) {
			System.out.println(b.getTitle() + "_" + b.getContent());
		}

	}

}
