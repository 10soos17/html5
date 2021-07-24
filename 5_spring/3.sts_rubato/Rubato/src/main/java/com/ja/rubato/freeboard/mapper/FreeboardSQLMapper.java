package com.ja.rubato.freeboard.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.text.StringEscapeUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import com.ja.rubato.board.mapper.BoardSQLMapper;
import com.ja.rubato.member.mapper.MemberSQLMapper;
import com.ja.rubato.vo.BoardCommentVo;
import com.ja.rubato.vo.BoardImageVo;
import com.ja.rubato.vo.BoardVo;
import com.ja.rubato.vo.FreeboardCommentVo;
import com.ja.rubato.vo.FreeboardImageVo;
import com.ja.rubato.vo.FreeboardVo;
import com.ja.rubato.vo.MemberVo;

public interface FreeboardSQLMapper {



	public int getContentCount(			
			@Param("freeboard_search_type") String freeboard_search_type,
			@Param("freeboard_search_word") String freeboard_search_word,
			@Param("freeboard_page_num") int freeboard_page_num);
	

	public ArrayList<FreeboardVo> getContents(			
			@Param("freeboard_search_type") String freeboard_search_type,
			@Param("freeboard_search_word") String freeboard_search_word,
			@Param("freeboard_page_num") int freeboard_page_num);

	
	//create primary key
	public int createFreeboardPK();
	
	//insert
	public void writeContent(FreeboardVo vo);
	
	public void writeComment(FreeboardCommentVo vo);

	//select
	public FreeboardVo getContentByNo(int freeboard_no);
	
	//delete
	public void deleteContent(int freeboard_no);
	
	//update
	public void updateContent(FreeboardVo vo);

	//조회수 증가
	public void increaseReadCount(int freeboard_no);
	
	//Image 관련, 등록
	public void registerImage(FreeboardImageVo vo);
	
	public ArrayList<FreeboardImageVo> getImageInfoByBoardNo(int freeboard_no);
	
	//comment 관련 
	public ArrayList<FreeboardCommentVo> getCommentInfoByBoardNo(int freeboard_no);
	
	public void deleteComment(FreeboardCommentVo vo);
	
	public void updateComment(FreeboardCommentVo vo);
	
	public void upRecommend(int freeboard_no);

}
