package com.cto.auction.repository.auctionUser;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import com.cto.auction.vo.auctionUser.AuctionUser;

@Repository
public interface AuctionUserDAO {

	public AuctionUser loginCheck(AuctionUser mem);

	public void signUpProc(AuctionUser ins);

	public void logout(HttpSession session);

	// 테스트용 코드 삭제해도됨
	public List<AuctionUser> auctionUserList(AuctionUser list);

	public AuctionUser auctionUserInfo(AuctionUser info);

	public void auctionUserUpdate(AuctionUser upt);
	public void auctionUserUpdate2(AuctionUser upt);

	public void auctionUserDelete(AuctionUser del);

}
