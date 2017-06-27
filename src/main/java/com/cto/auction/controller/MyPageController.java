package com.cto.auction.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Service
@RequestMapping("/*")
public class MyPageController {
	@Autowired(required=false)
/*	private AuctionUserService service;
	private UserPaymentService service2;
	
	@RequestMapping("main.do")
	public String main(){
		return "main/main";
	}
	
	// TODO 같은코드 반복.. 줄이는 방법모색
	@RequestMapping("main/menuList.do")
	public ModelAndView mainMenuList(ModelAndView mav){
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "main/menuList");
		return mav;
	}
	@RequestMapping("myPage/auctionInfo.do")
	public ModelAndView myPageAuctionInfo(ModelAndView mav){
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "myPage/auctionInfo");
		return mav;
	}
	@RequestMapping("myPage/message.do")
	public ModelAndView myPageMessage(ModelAndView mav){
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "myPage/message");
		return mav;
	}
	@RequestMapping("myPage/getInfo.do")
	public ModelAndView myPageGetInfo(ModelAndView mav){
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "myPage/getInfo");
		return mav;
	}
	@RequestMapping("myPage/locationInfo.do")
	public ModelAndView myPageLocationInfo(ModelAndView mav){
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "myPage/locationInfo");
		return mav;
	}
	@RequestMapping("myPage/userPayment.do")
	public ModelAndView myPageUserPayment(ModelAndView mav){
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "myPage/UserPayment");
		return mav;
	}
	
	@RequestMapping("myPage/userPaymentProc.do")
	public String myPageUserPaymentProc(UserPayment pay){
		service2.myPageUserPaymentProc(pay);
		return "redirect:myPage/UserPayment.do";
	}
	
	@RequestMapping("myPage/userPaymentInfo.do")
	public String userPaymentInfo(UserPayment pay){
		ModelAndView mav = new ModelAndView();
		service2.userPaymentInfo(pay);
		return "redirect:myPage/UserPayment.do";
	}
	
	
	
	
	
	
	@RequestMapping("myPage/userInfo.do")
	public ModelAndView myPageUserInfo(AuctionUser info, HttpSession session, Model m, ModelAndView mav){
		m.addAttribute("mem", service.auctionUserInfo(info, session));
		mav.setViewName("main/menuHome");
		mav.addObject("paramPage01", "myPage/userInfo");
		return mav;
	}
	
	// TODO 공지, 판매자, 등록..
	
	
//	회원정보 수정
	@RequestMapping("myPage/update.do")
	public String auctionUserUpdate(AuctionUser upt){
		service.auctionUserUpdate(upt);
		return "redirect:/myPage/userInfo.do";
		}

//	회원 삭제
	@RequestMapping("myPage/delete.do")
	public String auctionUserDelete(AuctionUser del, HttpSession session){
		service.auctionUserDelete(del, session);
		return "redirect:/main.do";
	}
//	로그아웃
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav){
		service.logout(session);
		mav.setViewName("/main/main");
		mav.addObject("msg", "logout");
		return mav;
	}*/
	
}
