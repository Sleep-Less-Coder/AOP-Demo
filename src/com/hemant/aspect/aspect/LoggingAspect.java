package com.hemant.aspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	//This is where we add all our related logging advice
	
	//Whatever is inside the quote in @Before advice is called 
	//the point cut expression
	//And @Before is an advice
	
//	@Before("execution(public void com.hemant.aspect.dao.AccountDAO.doSomeStuff())")
//	public void beforedoSomeStuffAdvice() {
//		System.out.println(">>==========>> Executing the @Before advice on doSomeStuff() method call.");
//	}
	
	//Since we have given the fully qualified name of the class
	//it will only apply to the doSomeStuff() method of AccountDAO
	
//	@Before("execution(* add*())")
//	public void beforedoSomeStuffAdvice() {
//		System.out.println(">>==========>> Executing the @Before advice on any method with add* call.");
//	}
	
	@Before("execution(* com.hemant.aspect.dao.*.*(..))")
	public void beforedoSomeStuffAdvice() {
		System.out.println(">>==========>> Executing the @Before advice on any method with add* call that takes an Account parameter");
	}
}
