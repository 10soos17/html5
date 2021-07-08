package com.ja.finalproject2.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@RequestMapping("mainPage.do")
	public String mainPage() {
		//할 것 많음 
		
		return "board/mainPage";
	}
	
}
