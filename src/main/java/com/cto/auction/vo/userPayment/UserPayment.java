package com.cto.auction.vo.userPayment;

public class UserPayment {
	private Integer card_id;
	private Integer user_id;
	private double serial_number;
	private Integer cvc;
	private Integer month;
	private Integer year;
	private Integer card_company;
	
	public Integer getCard_id() {
		return card_id;
	}
	public void setCard_id(Integer card_id) {
		this.card_id = card_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public double getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(double serial_number) {
		this.serial_number = serial_number;
	}
	public Integer getCvc() {
		return cvc;
	}
	public void setCvc(Integer cvc) {
		this.cvc = cvc;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getCard_company() {
		return card_company;
	}
	public void setCard_company(Integer card_company) {
		this.card_company = card_company;
	}
}
