/*CREATE TABLE AUCTION_USER
(
   USER_ID         NUMBER (10),
   USER_NAME       VARCHAR2 (100),
   EMAIL           VARCHAR2 (40),
   PASSWORD        VARCHAR2 (20),
   REGISTER_DATE   DATE,
   AUTH            NUMBER (1),
   USER_POINT      NUMBER (10),
   REAL_NAME       VARCHAR2 (100),
   ADDRESS         VARCHAR2 (100),
   ZIP_CODE        NUMBER (6),
   PHONE_NUMBER    NUMBER (11),
   PICTURE         VARCHAR2 (100)
)
NOCACHE
LOGGING;

INSERT INTO AUCTION_USER
     VALUES (1,
             '관리자닉네임',
             'admin@cto.com',
             '1111',
             SYSDATE + 0,
             1,
             5000000000,
             '관리자',
             '에이콘아카데미',
             655555,
             01077777777,
             'picture');

COMMIT;

SELECT * FROM AUCTION_USER;*/

package com.cto.auction.vo.auctionUser;

import java.util.Date;

public class AuctionUser {
	private Integer user_id; // USER_ID NUMBER (10),
	private String user_name; // USER_NAME VARCHAR2 (100),
	private String email; // EMAIL VARCHAR2 (40),
	private String password; // PASSWORD VARCHAR2 (20),
	private Date register_date; // REGISTER_DATE DATE DEFAULT SYSDATE,
	private int auth; // AUTH NUMBER (1) DEFAULT 1,
	private int user_point; // USER_POINT NUMBER (10) DEFAULT 0,
	private String real_name; // REAL_NAME VARCHAR2 (100),
	private String address; // ADDRESS VARCHAR2 (100),
	private String zip_code; // ZIP_CODE VARCHAR2 (5),
	private String phone_number; // PHONE_NUMBER VARCHAR2 (11),
	private String picture_location;// PICTURE_LOCATION VARCHAR2 (500)

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegister_date() {
		return register_date;
	}

	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPicture_location() {
		return picture_location;
	}

	public void setPicture_location(String picture_location) {
		this.picture_location = picture_location;
	}

}