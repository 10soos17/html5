package study14_board.hashMap;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		boolean isStop = false;
		int select;
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();

		do {

			for (int i = 0; i < 3; i++) {
				try {
					System.out.println("##메뉴를 입력하세요.##");
					System.out.println("1.게시판 글쓰기 2.글 목록 보기 3. 글 삭제 4. 종료");

					select = sc.nextInt();
					if (select < 0 || select > 4) {
						throw new Exception();
					} else {
						switch (select) {
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
					}
				} catch (Exception e) {
					System.out.println("잘못입력");
					sc.next();
				}

			}
			System.out.println("3회 입력 오류. 종료.");
			isStop = !isStop;

		} while (!isStop);

	}

}