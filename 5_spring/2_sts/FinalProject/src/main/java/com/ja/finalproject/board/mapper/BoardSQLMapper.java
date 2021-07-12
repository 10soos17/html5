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
	
}
