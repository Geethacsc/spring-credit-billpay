package com.springmvc.billpay.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MyDateFormatter implements Formatter<Date>{

	@Override
	public String print(Date date,Locale locale) {
		return null;
	}
	
	@Override
	public Date parse(String myDate,Locale locale) throws ParseException {
		System.out.println("inside Date formatter");
		return new SimpleDateFormat("dd-mm-yyyy").parse(myDate);
	}
}
