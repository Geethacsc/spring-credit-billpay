package com.springmvc.billpay.formatter;

//We can do the the dame functionality using Property Editor method also
import java.util.Locale;

import org.springframework.format.Formatter;

import com.springmvc.billpay.dto.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard card, Locale locale) {
		System.out.println("inside print method of card formatter");
		return card.toString();
	}

	@Override
	public CreditCard parse(String cardStr, Locale locale) {
		System.out.println("Inside parse method");
		CreditCard card = new CreditCard();
		if (cardStr.indexOf("-") != -1) {
			String[] cardArr = cardStr.split("-");
			card.setFirstFourDigits(cardArr[0]);
			card.setSecondFourDigits(cardArr[1]);
			card.setThirdFourDigits(cardArr[2]);
			card.setLastFourDigits(cardArr[3]);
		} else {
			card.setFirstFourDigits(cardStr.substring(0,3));
			card.setSecondFourDigits(cardStr.substring(4,7));
			card.setThirdFourDigits(cardStr.substring(8,11));
			card.setLastFourDigits(cardStr.substring(12));

		}
		return card;
	}
}
