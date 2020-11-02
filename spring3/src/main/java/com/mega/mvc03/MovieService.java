package com.mega.mvc03;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	MemberDAO dao;
	
	public String[] idCheck(String id) {
		String[] idList = {"root", "admin", "apple", "melon", "mint"};
		List<String> list = Arrays.asList(idList);
		String result = "사용가능";
		String page = "ok";
		if(list.contains(id)) {
			result = "사용불가능";
			page = "no";
		}
		String[] values = {result, page};
		return values;
	}
	
	public int service(int price) {
		price = price - 1000;
		//dao.create(price);
		return price;
	}

}
