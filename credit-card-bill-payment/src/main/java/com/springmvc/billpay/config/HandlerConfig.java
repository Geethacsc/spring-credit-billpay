package com.springmvc.billpay.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.springmvc.billpay.formatter.CreditCardFormatter;


@Configuration
@ComponentScan(basePackages="com.springmvc.billpay.controller")
@EnableWebMvc
public class HandlerConfig implements WebMvcConfigurer {
	
	@Bean("myViewResolver")
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean("messageSource")
	public MessageSource myMessageSource() {
		ResourceBundleMessageSource resource=new ResourceBundleMessageSource();
		resource.addBasenames("messages");
		return resource;
	}
	
	
	public LocalValidatorFactoryBean myValidator() {
		LocalValidatorFactoryBean localValidatorFactoryBean=new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(myMessageSource());
		return localValidatorFactoryBean;
	}
	@Override
	public void addFormatters(FormatterRegistry register) {
		System.out.println("inside formatter");
		register.addFormatter(new CreditCardFormatter());
	}
	
	@Override
	public Validator getValidator() {
		return myValidator();
	}
}

