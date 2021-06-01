package study14_board.arraylist;

import java.util.Scanner;

public class BoardMain {
	static String select;

	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();

		for (int i = 0; i < 5; i++) {
			System.out.println("##메뉴를 입력하세요.##");
			System.out.println("1.게시판 글쓰기 2.글 목록 보기 3. 글 삭제 4. 종료");
			
			select = sc.next();
			if (select == "1" || select == "2" || select == "3" || select == "4") {
				
				i = 5;

			} else {
				System.out.println("잘못 입력");
				i += 1;
				continue;
			}

		}

		do {

			switch (Integer.parseInt(select))

			{
			case 1:
				boardSVC.writeArticle(sc);
				break;
			case 2:
				boardSVC.listArticles(sc);
				break;
			case 3:
				boardSVC.removeArticle(sc);
				break;
			case 4:
				isStop = !isStop;
				break;

			}
		} while (!isStop);

	}

}
