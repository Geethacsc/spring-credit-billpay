package com.springmvc.billpay.dto;

public class CreditCard {

	private String firstFourDigits;
	private String secondFourDigits;
	private String thirdFourDigits;
	private String lastFourDigits;

	public String getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(String firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public String getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(String secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	public String getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(String thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	public String getLastFourDigits() {
		return lastFourDigits;
	}

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	@Override
	public String toString() {
		return firstFourDigits+"-"+secondFourDigits+"-"+thirdFourDigits+"-"+lastFourDigits;
	}

	
}
