package com.cto.auction.controller.auctionUser;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cto.auction.service.auctionUser.AuctionUserService;
import com.cto.auction.vo.auctionUser.AuctionUser;

@Controller
public class AuctionUserController {
	@Autowired(required = false)
	private AuctionUserService AuctionUserService;

	// 로그인 접속
	@RequestMapping("/auctionUser/login.do")
	public String login() {
		return "login/login";
	}

	// 로그인 체크
	@RequestMapping("/auctionUser/loginCheck.do")
	public ModelAndView loginCheck(AuctionUser mem, HttpSession session, ModelAndView mav) {
		// 로그인 체크시 null값이 아니면(회원정보가 있으면)
		if (AuctionUserService.loginCheck(mem) != null) {
			// 해당 멤버의 정보를 "mem"이라는 이름으로 세션에 넣겠다.
			session.setAttribute("mem", AuctionUserService.loginCheck(mem));
			session.setAttribute("sessionUser_id", AuctionUserService.loginCheck(mem).getUser_id());
			/*
			 * System.out.println("테스트 세션 id:"+(int)session.getAttribute(
			 * "user_id"));
			 */
			// session.setAttribute("email", mem.getEmail());
			// 보여주는 view 경로 설정( 로그인이 성공 했으면 main으로)
			mav.setViewName("main/main");
			// 해당 view에 포함시킬 객체 설정(로그인 여부 msg를 설정함-success)
			mav.addObject("msg", "success");
		} else {
			// 로그인 체크 null값이면 다시 login 페이지로
			mav.setViewName("login/login");
			// 해당 view에 포함시킬 객체 설정
			mav.addObject("msg", "failure");
		}
		return mav;
	}

	// 회원가입폼으로 이동
	@RequestMapping("/auctionUser/signUp.do")
	public String signUp() {
		return "login/signup";
	}

	// 실질적인 회원가입 진행로직
	@RequestMapping("/auctionUser/signUpProc.do")
	public String signUpProc(AuctionUser ins) {
		AuctionUserService.signUpProc(ins);
		return "redirect:login.do";
	}

	// 로그아웃
	@RequestMapping("/auctionUser/logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
		AuctionUserService.logout(session);
		mav.setViewName("/main/main");
		mav.addObject("msg", "logout");
		return mav;
	}

	// 회원개인 정보 + 주소정보
	@RequestMapping("/myPage/userInfo.do")
	public ModelAndView myPageUserInfo(AuctionUser info, HttpSession session, ModelAndView mav) {
		mav.setViewName("menu/menu");
		mav.addObject("pageName", "myPage/userInfo");
		mav.addObject("userInfo", AuctionUserService.auctionUserInfo(info, session));
		return mav;
	}
	@RequestMapping("/myPage/locationInfo.do")
	public ModelAndView myPageLocationInfo(AuctionUser info, HttpSession session, ModelAndView mav) {
		mav.setViewName("menu/menu");
		mav.addObject("pageName", "myPage/locationInfo");
		mav.addObject("userInfo", AuctionUserService.auctionUserInfo(info, session));
		return mav;
	}

	// 회원정보 수정
	@RequestMapping("/myPage/update.do")
	public String auctionUserUpdate(AuctionUser upt) {
		AuctionUserService.auctionUserUpdate(upt);
		return "redirect:/myPage/userInfo.do";
	}
	@RequestMapping("/myPage/update2.do")
	public String auctionUserUpdate2(AuctionUser upt) {
		AuctionUserService.auctionUserUpdate2(upt);
		return "redirect:/myPage/locationInfo.do";
	}

	// 회원 삭제
	@RequestMapping("/myPage/delete.do")
	public String auctionUserDelete(AuctionUser del, HttpSession session) {
		AuctionUserService.auctionUserDelete(del, session);
		return "redirect:/main.do";
	}

	// 회원정보에 합침.
	/*@RequestMapping("myPage/locationInfo.do")
	public ModelAndView myPageLocationInfo(AuctionUser info, HttpSession session, ModelAndView mav) {
		// menu/menu 페이지로 이동
		mav.setViewName("menu/menu");
		// menu.jsp 에 포함된 인클루드 페이지 auctionInfo.jsp
		mav.addObject("pageName", "myPage/locationInfo");
		// 입찰중인 물품(경매시간 남은 경우. 입찰가와 상관없음)
		mav.addObject("bidding", AuctionUserService.auctionUserInfo(info, session));
		return mav;
	}*/

	@RequestMapping("myPage/message.do")
	public ModelAndView myPageMessage(ModelAndView mav) {
		mav.setViewName("menu/menu");
		mav.addObject("pageName", "myPage/message");
		return mav;
	}

	@RequestMapping("myPage/delivery.do")
	public ModelAndView myPageDelivery(ModelAndView mav) {
		mav.setViewName("menu/menu");
		mav.addObject("pageName", "myPage/delivery");
		return mav;
	}

	@RequestMapping("myPage/userPayment.do")
	public ModelAndView myPageUserPayment(ModelAndView mav) {
		mav.setViewName("menu/menu");
		mav.addObject("pageName", "myPage/userPayment");
		return mav;
	}

}
