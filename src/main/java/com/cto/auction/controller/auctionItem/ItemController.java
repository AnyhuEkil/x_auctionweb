package com.cto.auction.controller.auctionItem;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cto.auction.service.auctionItem.AuctionItemService;
import com.cto.auction.vo.auctionItem.AuctionItem;

@Controller
@RequestMapping("/*")
public class ItemController {
	@Autowired(required = false)
	private AuctionItemService AuctionItemService;

	// menu/myPage/auctionInfo.jsp
	@RequestMapping("myPage/auctionInfo.do")
	public ModelAndView myPageAuctionInfo(AuctionItem info, HttpSession session, ModelAndView mav) {
		// menu/menu 페이지로 이동
		mav.setViewName("menu/menu");
		// menu.jsp 에 포함된 인클루드 페이지 auctionInfo.jsp
		mav.addObject("pageName", "myPage/auctionInfo");
		// 입찰중인 물품(경매시간 남은 경우. 입찰가와 상관없음)
		if (AuctionItemService.auctionUserInfoBidding(info, session) != null) {
			mav.addObject("bidding", AuctionItemService.auctionUserInfoBidding(info, session));
		} else {
			mav.addObject("biddingMsg", "nothing");
		}
		// 낙찰된 물품(경매시간이 끝났고, 입찰가가 1등인경우)
		if (AuctionItemService.auctionUserInfoWinBid(info, session) != null) {
			mav.addObject("winBid", AuctionItemService.auctionUserInfoWinBid(info, session));
		} else {
			mav.addObject("winBidMsg", "nothing");
		}
		// 낙찰에 실패한 물품(경매시간끝났고, 입찰가가 1등이 아닌경우)
		if (AuctionItemService.auctionUserInfoLoseBid(info, session) != null) {
			mav.addObject("loseBid", AuctionItemService.auctionUserInfoLoseBid(info, session));
		} else {
			mav.addObject("loseBidMsg", "nothing");
		}
		return mav;
	}

}
