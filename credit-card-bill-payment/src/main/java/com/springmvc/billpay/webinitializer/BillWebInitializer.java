package com.springmvc.billpay.webinitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springmvc.billpay.config.HandlerConfig;

public class BillWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] handler= {HandlerConfig.class};
		return handler;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] webUrl= {"/"};
		return webUrl;
	}
	
	
}
