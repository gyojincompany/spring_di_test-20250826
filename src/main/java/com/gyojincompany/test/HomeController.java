package com.gyojincompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	
	@RequestMapping(value = "/") //루트 요청->대문 페이지 매핑
	public String home() {		
		
		return "home";
	}
	
	@RequestMapping(value = "/hello")	
	public String hello() {		
		
		return "hello";
	}	
	
}
