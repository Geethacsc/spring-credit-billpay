package com.springmvc.billpay.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Currency;

import com.springmvc.billpay.validatorannotations.Card;


public class CreditBillDTO {

	// @NotBlank,@NotEmpty - only works on String
	@Card
	private CreditCard creditCardNo;
	private BigDecimal amount;
	private Currency currency;
	private Date date;

	public CreditCard getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(CreditCard creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
