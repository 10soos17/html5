package study14_board.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	BoardVO bvo;
	ArrayList<BoardVO> bList = new ArrayList<>();

	String name, pw;

	// Scanner입력
	public void writeArticle(Scanner sc) {
		bvo = new BoardVO();
		System.out.println("[게시판 글을 작성하세요]");
		System.out.print("작성자: ");
		bvo.setRegister(sc.next());
		System.out.print("이메일: ");
		bvo.setEmail(sc.next());
		System.out.print("비밀번호: ");
		bvo.setPasswd(sc.next());
		System.out.print("제목: ");
		bvo.setSubject(sc.next());
		System.out.print("글 내용: ");
		bvo.setContent(sc.next());
		addArticle(bvo);
	}

	// boardList 객체에 boardVO 객체 하나를 요소로 추가, 즉, 게시판 글 하나를 등록
	private void addArticle(BoardVO boardVO) {
		bList.add(boardVO);

	}

	// ArrayList 객체에 저장되어 있는 게시판 글 목록을 출력해 주는 메소드
	public void listArticles(Scanner sc) {
		for (BoardVO bvo : bList) {
			System.out.println(bvo.toString());
		}

	}

	public void removeArticle(Scanner sc) {
		System.out.println("[제거할 글의 작성자와 비밀번호를 입력하세요]");
		System.out.println("작성자: ");
		name = sc.next();
		System.out.println("비밀번호: ");
		pw = sc.next();
		removeArticle(name, pw);
	}

	private void removeArticle(String register, String passwd) {
		for (BoardVO b : bList) {
			if (bvo.getRegister().equals(register) && bvo.getPasswd().equals(passwd)) {
				//System.out.println(bvo.getRegister());
				bList.remove(b);
				break;
			}
		}
	}
}
