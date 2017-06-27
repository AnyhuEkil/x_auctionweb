package com.cto.auction.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Service
@RequestMapping("/*")
public class ModuleTest {
	@RequestMapping("test00")
	public String test00() {
		String test00 = "menu/menuHome";
		System.out.println("테스트경로 : views/" + test00);
		return test00;
	}

	@RequestMapping("test01")
	public ModelAndView test01(ModelAndView mv) {
		mv.addObject("paramPage01", "myPage/userPayment");
		mv.setViewName("menu/menuHome");
		return mv;
	}
}
