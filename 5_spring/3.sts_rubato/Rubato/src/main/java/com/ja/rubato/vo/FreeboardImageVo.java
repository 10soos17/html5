package com.ja.rubato.vo;

public class FreeboardImageVo {
	
	private int freeboard_image_no;
	private int freeboard_no;
	private String freeboard_image_url;
	private String freeboard_image_ori;
	
	public FreeboardImageVo(int freeboard_image_no, int freeboard_no, String freeboard_image_url,
			String freeboard_image_ori) {

		this.freeboard_image_no = freeboard_image_no;
		this.freeboard_no = freeboard_no;
		this.freeboard_image_url = freeboard_image_url;
		this.freeboard_image_ori = freeboard_image_ori;
	}
	
	public FreeboardImageVo() {
	}
	
	public int getFreeboard_image_no() {
		return freeboard_image_no;
	}

	public void setFreeboard_image_no(int freeboard_image_no) {
		this.freeboard_image_no = freeboard_image_no;
	}

	public int getFreeboard_no() {
		return freeboard_no;
	}

	public void setFreeboard_no(int freeboard_no) {
		this.freeboard_no = freeboard_no;
	}

	public String getFreeboard_image_url() {
		return freeboard_image_url;
	}

	public void setFreeboard_image_url(String freeboard_image_url) {
		this.freeboard_image_url = freeboard_image_url;
	}

	public String getFreeboard_image_ori() {
		return freeboard_image_ori;
	}

	public void setFreeboard_image_ori(String freeboard_image_ori) {
		this.freeboard_image_ori = freeboard_image_ori;
	}


}
