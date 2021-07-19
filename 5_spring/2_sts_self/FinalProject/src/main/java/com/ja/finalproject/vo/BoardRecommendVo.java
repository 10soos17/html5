package com.ja.finalproject.vo;

import java.util.Date;

public class BoardRecommendVo {
	
	private int recommend_no;
	private int board_no;
	private int  member_no;
	private Date recommend_date;
	
	public BoardRecommendVo() {
	}
	
	public BoardRecommendVo(int recommend_no, int board_no, int member_no, Date recommend_date) {
		this.recommend_no = recommend_no;
		this.board_no = board_no;
		this.member_no = member_no;
		this.recommend_date = recommend_date;
	}

	public int getRecommend_no() {
		return recommend_no;
	}
	public void setRecommend_no(int recommend_no) {
		this.recommend_no = recommend_no;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public Date getRecommend_date() {
		return recommend_date;
	}
	public void setRecommend_date(Date recommend_date) {
		this.recommend_date = recommend_date;
	}

}
