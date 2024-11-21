package com.springmvc.billpay.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

//Formatter and Property Editor are Similar
//We can achieve the same functionality by Using both Formatter and Property Editor
public class MyCurrencyEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String text ) throws IllegalArgumentException {//string to object (parse)
		Currency currency=Currency.getInstance(text.toUpperCase());
		setValue(currency);
	}
	
	@Override
	public String getAsText() {//object to string (print)
		Currency currency=(Currency) getValue();
		return currency.toString();
	}
}
