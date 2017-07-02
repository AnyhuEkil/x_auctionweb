package com.cto.auction.service.auctionItem;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cto.auction.repository.auctionItem.AuctionItemDAO;
import com.cto.auction.vo.auctionItem.AuctionItem;

@Service
public class AuctionItemService {
	
	@Autowired(required=false)
	private AuctionItemDAO dao;
	
	// 종원~
	public List<AuctionItem> auctionUserInfoWinBid(AuctionItem info, HttpSession session) {
		info.setAuctioneer_id((Integer)session.getAttribute("sessionUser_id"));
		return dao.auctionUserInfoWinBid(info);
	}
	public List<AuctionItem> auctionUserInfoBidding(AuctionItem info, HttpSession session) {
		info.setAuctioneer_id((Integer)session.getAttribute("sessionUser_id"));
		return dao.auctionUserInfoBidding(info);
	}
	public List<AuctionItem> auctionUserInfoLoseBid(AuctionItem info, HttpSession session) {
		info.setAuctioneer_id((Integer)session.getAttribute("sessionUser_id"));
		return dao.auctionUserInfoLoseBid(info);
	}
	
}
