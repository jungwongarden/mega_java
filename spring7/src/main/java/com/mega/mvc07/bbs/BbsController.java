package com.mega.mvc07.bbs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@RequestMapping("bbs/list3.do")
	public void list3(Model model) {
		System.out.println("bbs가 호출됨.");
	}
}
