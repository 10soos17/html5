package com.ja.finalproject.board.service;
import com.ja.finalproject.vo.BoardCommentVo;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.finalproject.board.mapper.BoardSQLMapper;
import com.ja.finalproject.member.mapper.MemberSQLMapper;
import com.ja.finalproject.vo.BoardImageVo;
import com.ja.finalproject.vo.BoardVo;
import com.ja.finalproject.vo.MemberVo;

@Service
public class BoardServiceImpl {

	
	@Autowired
	private BoardSQLMapper boardSQLMapper;
	@Autowired
	private MemberSQLMapper memberSQLMapper;

	public void writeContent(BoardVo vo, ArrayList<BoardImageVo> boardImageVoList) {
		
		int board_no = boardSQLMapper.createBoardPK();
		
		vo.setBoard_no(board_no);
		
		boardSQLMapper.writeContent(vo);
		
		for(BoardImageVo boardImageVo : boardImageVoList) {
			
			boardImageVo.setBoard_no(board_no);
			boardSQLMapper.registerImage(boardImageVo);
		}
	}
	
	public void writeComment(BoardCommentVo vo) {
		
		boardSQLMapper.writeComment(vo);
		
		
	}

	public ArrayList<HashMap<String, Object>> getContents(String search_type, String search_word, int page_num) {

		// 자료 구조의 활용 ... 메모리 관리의 중요한 내용 ... 체크해 둘 것 ...

		// db로부터 ArrayList<BoardVo>자료구조로 뺀 글 목록 -> 루프 돌리면서 글목록의 작성자번호 읽기-> 
		// 작성자번호로 db로부터 MemberVo정보 추출
		// ->HashMap<String, Object>에 두 개의 db 정보 합치기
		// ->최종 ArrayList<HashMap<String, Object>>에 차례로 정보 넣기

		// HashMap을 담을 ArrayList
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		// FP_Board table로부터 값 빼기
		ArrayList<BoardVo> boardList = boardSQLMapper.getContents(search_type, search_word, page_num);

		for (BoardVo boardVo : boardList) {
			int memberNo = boardVo.getMember_no();
			// FP_Member table로부터 member_no 값으로 데이터 빼기
			MemberVo memberVo = memberSQLMapper.getMemberByNo(memberNo);

			// HashMap<String, Objec>에 두 vo(memberVo+boardVo) 합치기
			HashMap<String, Object> map = new HashMap<String, Object>();

			map.put("memberVo", memberVo);
			map.put("boardVo", boardVo);

			// 최종 ArrayList에 차례로 <HashMap<String, Object> 정보(vo(memberVo+boardVo) 넣기
			list.add(map);

		}
		return list;
	}
	//페이지 번호 계산 전에 호출 
	public int getContentCount(String search_type, String search_word, int page_num) {
		
		int count = boardSQLMapper.getContentCount(search_type, search_word, page_num);
		//System.out.println("count: "+count);
		return count;
	}
	
	//게시판 글 클릭시, board_no로 board db정보 받아오고 
	//board_no = member_no로 Member db정보 받기
	//-> HashMap<String, Object>에 두 db정보 합치기 
	public HashMap<String, Object> getContent(int board_no) {
		
		BoardVo boardVo = boardSQLMapper.getContentByNo(board_no);
		
		//html escape API
		String content = boardVo.getBoard_content();
		System.out.println("[변환 전 테스트] "+content);
		
		content = StringEscapeUtils.escapeHtml4(content);
		System.out.println("[변환 후 테스트] "+content);
		
		content = content.replaceAll("\n", "<br>");
		boardVo.setBoard_content(content);
		
		int member_no = boardVo.getMember_no();
		MemberVo memberVo = memberSQLMapper.getMemberByNo(member_no);
		
		ArrayList<BoardImageVo> boardImageVoList = 
				boardSQLMapper.getImageInfoByBoardNo(board_no);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("memberVo",memberVo);
		map.put("boardVo", boardVo);
		map.put("boardImageVoList", boardImageVoList);
		
		return map;
	}
	
	public void increaseReadCount(int board_no) {
		boardSQLMapper.increaseReadCount(board_no);
	}
	
	public void deleteContent(int board_no) {
		boardSQLMapper.deleteContent(board_no);
	}
	
	public void updateContent(BoardVo vo) {
		boardSQLMapper.updateContent(vo);
	}
}





