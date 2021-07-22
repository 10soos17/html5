package com.ja.rubato.vo;

import java.util.Date;

public class FreeboardVo {

	private int freeboard_no;
	private String freeboard_nick;
	private String freeboard_pw;
	private String freeboard_title;
	private String freeboard_content;
	private int freeboard_readcount;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date freeboard_writedate;
	private int freeboard_recommendcount;
	
	public FreeboardVo() {
	}

	public FreeboardVo(int freeboard_no, String freeboard_nick, String freeboard_pw, String freeboard_title,
			String freeboard_content, int freeboard_readcount, Date freeboard_writedate, int freeboard_recommendcount) {
		super();
		this.freeboard_no = freeboard_no;
		this.freeboard_nick = freeboard_nick;
		this.freeboard_pw = freeboard_pw;
		this.freeboard_title = freeboard_title;
		this.freeboard_content = freeboard_content;
		this.freeboard_readcount = freeboard_readcount;
		this.freeboard_writedate = freeboard_writedate;
		this.freeboard_recommendcount = freeboard_recommendcount;
	}
	
	public int getFreeboard_no() {
		return freeboard_no;
	}

	public void setFreeboard_no(int freeboard_no) {
		this.freeboard_no = freeboard_no;
	}

	public String getFreeboard_nick() {
		return freeboard_nick;
	}

	public void setFreeboard_nick(String freeboard_nick) {
		this.freeboard_nick = freeboard_nick;
	}

	public String getFreeboard_pw() {
		return freeboard_pw;
	}

	public void setFreeboard_pw(String freeboard_pw) {
		this.freeboard_pw = freeboard_pw;
	}

	public String getFreeboard_title() {
		return freeboard_title;
	}

	public void setFreeboard_title(String freeboard_title) {
		this.freeboard_title = freeboard_title;
	}

	public String getFreeboard_content() {
		return freeboard_content;
	}

	public void setFreeboard_content(String freeboard_content) {
		this.freeboard_content = freeboard_content;
	}

	public int getFreeboard_readcount() {
		return freeboard_readcount;
	}

	public void setFreeboard_readcount(int freeboard_readcount) {
		this.freeboard_readcount = freeboard_readcount;
	}

	public Date getFreeboard_writedate() {
		return freeboard_writedate;
	}

	public void setFreeboard_writedate(Date freeboard_writedate) {
		this.freeboard_writedate = freeboard_writedate;
	}

	public int getFreeboard_recommendcount() {
		return freeboard_recommendcount;
	}

	public void setFreeboard_recommendcount(int freeboard_recommendcount) {
		this.freeboard_recommendcount = freeboard_recommendcount;
	}

	
}