package com.ja.finalproject.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ja.finalproject.vo.BoardVo;

public interface BoardSQLMapper {

	//insert
	public void writeContent(BoardVo vo);
	
	
	//*** 2개 이상의 매개변수를 넘길 때, 
	//매개변수명 매핑시켜야 myBatis 동적쿼리 조건문에서 사용 가능
	
	//select
	//글 목록 조건에 따른 분기처리(전체 글 or 검색 조건에 따른 글)
	public ArrayList<BoardVo> getContents(
			@Param("search_type") String search_type,
			@Param("search_word") String search_word,
			@Param("page_num") int page_num
			);
	
	//select
	//페이징하기위해 가져올 글 카운트 
	public int getContentCount(
			@Param("search_type") String search_type,
			@Param("search_word") String search_word,
			@Param("page_num") int page_num	
			);
	
	//select
	public BoardVo getContentByNo(int board_no);
	
	//delete
	public void deleteContent(int board_no);
	
	//update
	public void updateContent(BoardVo vo);
	
	//조회수 증가
	public void increaseReadCount(int board_no);
}
