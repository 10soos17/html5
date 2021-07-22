package com.ja.rubato.freeboard.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.text.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.rubato.board.mapper.BoardSQLMapper;
import com.ja.rubato.freeboard.mapper.FreeboardSQLMapper;
import com.ja.rubato.member.mapper.MemberSQLMapper;
import com.ja.rubato.vo.BoardCommentVo;
import com.ja.rubato.vo.BoardImageVo;
import com.ja.rubato.vo.BoardVo;
import com.ja.rubato.vo.FreeboardImageVo;
import com.ja.rubato.vo.FreeboardVo;
import com.ja.rubato.vo.MemberVo;

@Service
public class FreeboardServiceImpl {

	@Autowired
	private FreeboardSQLMapper freeboardSQLMapper;

	public void writeContent(FreeboardVo vo, ArrayList<FreeboardImageVo> freeboardImageVoList) {
		// board DB PK 먼저 만들고 -> boardVo setting -> insert boardDB
		// -> BoardImageVo setting -> insert boardImageDB
		int freeboard_no = freeboardSQLMapper.createFreeboardPK();

		vo.setFreeboard_no(freeboard_no);

		freeboardSQLMapper.writeContent(vo);

		for (FreeboardImageVo freeboardImageVo : freeboardImageVoList) {

			freeboardImageVo.setFreeboard_no(freeboard_no);
			freeboardSQLMapper.registerImage(freeboardImageVo);
		}
	}

//	public void writeComment(BoardCommentVo vo) {
//
//		freeboardSQLMapper.writeComment(vo);
//
//	}
//
	// ==============================자유게시판 페이지 번호 계산 전에 호출
	public int getContentCount(String search_type, String search_word, int page_num) {

		int count = freeboardSQLMapper.getContentCount(search_type, search_word, page_num);
		// System.out.println("count: "+count);
		return count;
	}

	// ==============================자유게시판
	public ArrayList<FreeboardVo> getContents(String search_type, String search_word, int page_num) {

		ArrayList<FreeboardVo> freeboardList = freeboardSQLMapper.getContents(search_type, search_word, page_num);

		return freeboardList;
	}

//	// ==============================게시판 글 클릭 시
//	// 게시판 글 클릭시, board_no로 Board db정보 받아오고
//	// board_no = member_no로 Member db정보 받아오고
//	// board_no = member_no로 BoardImage db 정보 받기
//	// -> HashMap<String, Object>에 세 db정보 합치기
//	public HashMap<String, Object> getContent(int board_no, int loginMember_no) {
//
//		HashMap<String, Object> map = new HashMap<String, Object>();
//
//		// System.out.println("getContentCheck"+loginMember_no);
//		BoardVo boardVo = boardSQLMapper.getContentByNo(board_no);
//
//		// html escape API
//		String content = boardVo.getBoard_content();
//		System.out.println("[변환 전 테스트] " + content);
//
//		content = StringEscapeUtils.escapeHtml4(content);
//		System.out.println("[변환 후 테스트] " + content);
//
//		content = content.replaceAll("\n", "<br>");
//		boardVo.setBoard_content(content);
//
//		int member_no = boardVo.getMember_no();
//		MemberVo memberVo = memberSQLMapper.getMemberByNo(member_no);
//
//		ArrayList<BoardImageVo> boardImageVoList = boardSQLMapper.getImageInfoByBoardNo(board_no);
//
//		ArrayList<BoardCommentVo> boardCommentVoList = boardSQLMapper.getCommentInfoByBoardNo(board_no);
//		ArrayList<MemberVo> boardCommentMemberVoList = new ArrayList<>();
//
//		for (BoardCommentVo boardCommentVo : boardCommentVoList) {
//			int memberNo = boardCommentVo.getMember_no();
//			boardCommentMemberVoList.add(memberSQLMapper.getMemberByNo(memberNo));
//		}
//
//		int recommendNo = boardSQLMapper.getRecommendNo(board_no);
//
//		// 로그인한 경우만 추천가능하도록
//		if (loginMember_no != -1) {
//			int recommendCheck = boardSQLMapper.checkRecommend(board_no, loginMember_no);
//			// System.out.println(recommendCheck);
//			map.put("recommendCheck", recommendCheck);
//		}
//
//		map.put("memberVo", memberVo);
//		map.put("boardVo", boardVo);
//		map.put("boardImageVoList", boardImageVoList);
//		map.put("boardCommentVoList", boardCommentVoList);
//		map.put("boardCommentMemberVoList", boardCommentMemberVoList);
//		map.put("recommendNo", recommendNo);
//
//		return map;
//	}
//
//	// ==============================글쓰기 관련
//	public void increaseReadCount(int board_no) {
//		boardSQLMapper.increaseReadCount(board_no);
//	}

	public void deleteContent(int freeboard_no) {
		freeboardSQLMapper.deleteContent(freeboard_no);
	}

//	public void updateContent(BoardVo vo) {
//		boardSQLMapper.updateContent(vo);
//	}
//
//	// ==============================댓글 관련
//	public void deleteComment(int comment_no) {
//		boardSQLMapper.deleteComment(comment_no);
//	}
//
//	public void updateComment(String comment_content, int comment_no) {
//		boardSQLMapper.updateComment(comment_content, comment_no);
//	}
//
//	// ==============================좋아요 관련
//	public void upRecommend(int board_no, int member_no) {
//		boardSQLMapper.upRecommend(board_no, member_no);
//	}
//
//	public void downRecommend(int board_no, int member_no) {
//		boardSQLMapper.downRecommend(board_no, member_no);
//	}
}