package study14_board.arraylist.answer;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> bList;

	public BoardSVC() {
		bList = new ArrayList<>();
	}

	// 2. Scanner입력
	public void writeArticle(Scanner sc) {

		System.out.println("[게시판 글을 작성하세요]");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("비밀번호: ");
		String passwd = sc.next();
		System.out.print("제목: ");
		String subject = sc.next();
		System.out.print("글 내용: ");
		String content = sc.next();

		BoardVO bvo = new BoardVO(register, subject, email, content, passwd);

		addArticle(bvo);
	}

	// 3. boardList 객체에 boardVO 객체 하나를 요소로 추가, 즉, 게시판 글 하나를 등록
	private void addArticle(BoardVO boardVO) {
		bList.add(boardVO);

	}

	// 4. ArrayList 객체에 저장되어 있는 게시판 글 목록을 출력해 주는 메소드
	public void listArticles(Scanner sc) {
		if (bList.size() > 0) {
			for (int i = 0; i < bList.size(); i++) {
				System.out.println(bList.get(i));
			}
		} else
			System.out.println("등록된 글이 없습니다.");

	}

	// 5. 글 삭제 위한 입력
	public void removeArticle(Scanner sc) {
		System.out.println("[제거할 글의 작성자와 비밀번호를 입력하세요]");
		System.out.println("작성자: ");
		String register = sc.next();
		System.out.println("비밀번호: ");
		String passwd = sc.next();
		removeArticle(register, passwd);
	}

	// 6. 글 삭제 동작(실행)
	private void removeArticle(String register, String passwd) {
		if (bList.size() > 0) {
			int index = -1;
			for (int i = 0; i < bList.size(); i++) {
				if (bList.get(i).getRegister().equals(register)) {
					if (bList.get(i).getPasswd().equals(passwd)) {
						bList.remove(bList.get(i));
						index = i;
						;
					}
				}
			}
			if (index == -1) {
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}

		} else {
			System.out.println("작성된 글이 존재하지 않습니다.");
		}

	}
}
