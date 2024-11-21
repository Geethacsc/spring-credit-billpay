package com.springmvc.billpay.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.billpay.dto.CreditBillDTO;
import com.springmvc.billpay.dto.CreditCard;
import com.springmvc.billpay.formatter.MyDateFormatter;
import com.springmvc.billpay.propertyeditor.MyCurrencyEditor;

import jakarta.validation.Valid;

@Controller
public class CreditBillController {

	@RequestMapping("/")
	public String billPay(@ModelAttribute("billPay") CreditBillDTO creditBillDto) {
		System.out.println("Inside bill pay page");
		CreditCard card=new CreditCard();
		card.setFirstFourDigits("xxxx");
		card.setSecondFourDigits("xxxx");
		card.setThirdFourDigits("xxxx");
		card.setLastFourDigits("xxxx");
		Currency defaultCurrency=Currency.getInstance("INR");
		creditBillDto.setCreditCardNo(card);
		creditBillDto.setCurrency(defaultCurrency);
		return "credit-bill";
	}

	@RequestMapping("billpay-success")
	public String successBill(@Valid @ModelAttribute("billPay") CreditBillDTO creditBillDto, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "credit-bill";
		}
		return "success-bill";
	}

	@InitBinder
	public void myInitBinder(WebDataBinder binder) {
		StringTrimmerEditor strEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, strEditor);

		// editor for Date field
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, dateEditor);

		// editor for amount field
		DecimalFormat numberFormat = new DecimalFormat("##,###.00");
		CustomNumberEditor amountEditor = new CustomNumberEditor(BigDecimal.class, numberFormat, true);
		binder.registerCustomEditor(BigDecimal.class, "amount", amountEditor);

		// custom editor for Currency field
		MyCurrencyEditor currencyEditor = new MyCurrencyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyEditor);
		
		
		//can call formatter method in using webdatabinder class
		//binder.addCustomFormatter(new MyDateFormatter()); //works fine without this formatter
	}

}
