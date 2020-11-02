package com.mega.out01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("page2.mega")
	public void page2(String id, String pw, Model model) {
    	String result = "로그인 실패!!!";
    	if(id.equals("root") && pw.equals("1234")){
    		result = "로그인 성공!!!";
    	}
    	model.addAttribute("result", result);
	}
}
