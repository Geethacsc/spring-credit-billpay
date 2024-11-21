package com.springmvc.billpay.validatorannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
@Constraint(validatedBy= {CardConstraint.class})
@Documented
public @interface Card {

	String message() default "{credit.cardno}";
	
	int size() default 19;
	
	Class<?>[]  groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
