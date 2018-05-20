package com.hemant.aspect.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hemant.aspect.config.JavaSpringConfig;
import com.hemant.aspect.dao.AccountDAO;
import com.hemant.aspect.dao.MembershipDAO;
import com.hemant.aspect.entity.Account;

public class Main {
	public static void main(String[] args) {
		//retrieve the Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaSpringConfig.class);
		
		//grab the AccountDAO bean
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//grab the MembershipDAO bean
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		//Make the method calls on the AccountDAO bean
		Account myAccount = new Account();
		accountDAO.addAccount(myAccount, true);
		accountDAO.doWork();
		
		//Make the method calls on the MembershipDAO bean
		membershipDAO.addSillyMember();
		membershipDAO.goToSleep();
		
		//close the context
		context.close();
	}
}
