package com.ja.rubato.vo;

import java.util.Date;

public class FreeboardCommentVo {
	
	private int freeboard_comment_no;
    private String freeboard_nick;
    private int freeboard_comment_pw;
    private int freeboard_no;
    private String freeboard_comment_content;
    private Date freeboard_comment_writedate;
    
    public FreeboardCommentVo() {
	}
    
	public FreeboardCommentVo(int freeboard_comment_no, String freeboard_nick, int freeboard_comment_pw, int freeboard_no,
			String freeboard_comment_content, Date freeboard_comment_writedate) {
		this.freeboard_comment_no = freeboard_comment_no;
		this.freeboard_nick = freeboard_nick;
		this.freeboard_comment_pw = freeboard_comment_pw;
		this.freeboard_no = freeboard_no;
		this.freeboard_comment_content = freeboard_comment_content;
		this.freeboard_comment_writedate = freeboard_comment_writedate;
	}
	
	
    
    public int getFreeboard_comment_no() {
		return freeboard_comment_no;
	}
	public void setFreeboard_comment_no(int freeboard_comment_no) {
		this.freeboard_comment_no = freeboard_comment_no;
	}
	public String getFreeboard_nick() {
		return freeboard_nick;
	}
	public void setFreeboard_nick(String freeboard_nick) {
		this.freeboard_nick = freeboard_nick;
	}
	
	public int getFreeboard_comment_pw() {
		return freeboard_comment_pw;
	}

	public void setFreeboard_comment_pw(int freeboard_comment_pw) {
		this.freeboard_comment_pw = freeboard_comment_pw;
	}

	public int getFreeboard_no() {
		return freeboard_no;
	}
	public void setFreeboard_no(int freeboard_no) {
		this.freeboard_no = freeboard_no;
	}
	public String getFreeboard_comment_content() {
		return freeboard_comment_content;
	}
	public void setFreeboard_comment_content(String freeboard_comment_content) {
		this.freeboard_comment_content = freeboard_comment_content;
	}
	public Date getFreeboard_comment_writedate() {
		return freeboard_comment_writedate;
	}
	public void setFreeboard_comment_writedate(Date freeboard_comment_writedate) {
		this.freeboard_comment_writedate = freeboard_comment_writedate;
	}


}
