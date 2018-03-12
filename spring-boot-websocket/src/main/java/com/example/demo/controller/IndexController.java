package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	/**
	 * 首页映射器
	 * @return
	 */
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
