package com.springmvc.billpay.validatorannotations;

import com.springmvc.billpay.dto.CreditCard;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CardConstraint implements ConstraintValidator<Card, CreditCard> {

	private int size;

	@Override
	public void initialize(Card card) {
		this.size = card.size();
	}

	@Override
	public boolean isValid(CreditCard card, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (card == null) {
			return false;
		}
		if (size == 19) {
			String[] myCard = card.toString().split("-");
			System.out.println(size + card.toString() + card.toString().length());
			for (String c : myCard) {
				if (c.length() != 4)
					return false;
				try {
					Integer.parseInt(c);
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
			}
			return card.toString().length() == size && myCard.length == 4;
		} else
			return card.toString().length() == 16;
	}
}
