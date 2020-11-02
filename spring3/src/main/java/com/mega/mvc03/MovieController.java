package com.mega.mvc03;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieService service;
	
	
	@RequestMapping("idCheck.do")
	public String idCheck(String id, Model model) {
		
		String[] values = service.idCheck(id);
		
		model.addAttribute("result", values[0]);
		return values[1];
	}
	
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//db처리했음.
		//views로 넘어감.
		model.addAttribute("reply", reply);
	}
	
	
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model model) {
		price = service.service(price);		
		model.addAttribute("title", title);
		model.addAttribute("price", price);
		return "like";
	}
}
