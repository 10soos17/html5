package com.ja.finalproject.board.mapper;

import java.util.ArrayList;

import com.ja.finalproject.vo.BoardVo;

public interface BoardSQLMapper {

	//insert
	public void writeContent(BoardVo vo);
	
	//select
	public ArrayList<BoardVo> getContents();
	
	//select
	public BoardVo getContentByNo(int board_no);
	
	//delete
	public void deleteContent(int board_no);
	
	//update
	public void updateContent(BoardVo vo);
	
	//조회수 증가
	public void increaseReadCount(int board_no);
}
