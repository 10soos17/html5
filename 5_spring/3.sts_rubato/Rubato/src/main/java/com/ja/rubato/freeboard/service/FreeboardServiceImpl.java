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
import com.ja.rubato.vo.FreeboardCommentVo;
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

	public void writeComment(FreeboardCommentVo vo) {

		freeboardSQLMapper.writeComment(vo);

	}

	// ==============================자유게시판 페이지 번호 계산 전에 호출
	public int getContentCount(String freeboard_search_type, String freeboard_search_word, int freeboard_page_num) {

		int count = freeboardSQLMapper.getContentCount(freeboard_search_type, freeboard_search_word, freeboard_page_num);
		// System.out.println("count: "+count);
		return count;
	}

	// ==============================자유게시판
	public ArrayList<FreeboardVo> getContents(String freeboard_search_type, String freeboard_search_word, int freeboard_page_num) {

		ArrayList<FreeboardVo> freeboardList = freeboardSQLMapper.getContents(freeboard_search_type, freeboard_search_word, freeboard_page_num);

		return freeboardList;
	}

	// ==============================게시판 글 클릭 시
	// 게시판 글 클릭시, board_no로 Board db정보 받아오고
	// board_no = member_no로 Member db정보 받아오고
	// board_no = member_no로 BoardImage db 정보 받기
	// -> HashMap<String, Object>에 세 db정보 합치기
	public HashMap<String, Object> getContent(int freeboard_no) {

		HashMap<String, Object> map = new HashMap<String, Object>();

		FreeboardVo freeboardVo = freeboardSQLMapper.getContentByNo(freeboard_no);

		// html escape API
		String content = freeboardVo.getFreeboard_content();
		System.out.println("[변환 전 테스트] " + content);

		content = StringEscapeUtils.escapeHtml4(content);
		System.out.println("[변환 후 테스트] " + content);

		content = content.replaceAll("\n", "<br>");
		freeboardVo.setFreeboard_content(content);

		ArrayList<FreeboardImageVo> freeboardImageVoList = freeboardSQLMapper.getImageInfoByBoardNo(freeboard_no);

		ArrayList<FreeboardCommentVo> freeboardCommentVoList = freeboardSQLMapper.getCommentInfoByBoardNo(freeboard_no);

		map.put("freeboardVo", freeboardVo);
		map.put("freeboardImageVoList", freeboardImageVoList);
		map.put("freeboardCommentVoList", freeboardCommentVoList);

		return map;
	}

	// ==============================글쓰기 관련
	public void increaseReadCount(int freeboard_no) {
		freeboardSQLMapper.increaseReadCount(freeboard_no);
	}

	public void deleteContent(int freeboard_no) {
		freeboardSQLMapper.deleteContent(freeboard_no);
	}

	public void updateContent(FreeboardVo vo) {
		freeboardSQLMapper.updateContent(vo);
	}

	// ==============================댓글 관련
	public void deleteComment(FreeboardCommentVo vo) {
		freeboardSQLMapper.deleteComment(vo);
	}

	public void updateComment(FreeboardCommentVo vo) {
		freeboardSQLMapper.updateComment(vo);
	}

	// ==============================좋아요 관련
	public void upRecommend(int freeboard_no) {
		freeboardSQLMapper.upRecommend(freeboard_no);
	}

}