package com.hemant.aspect.dao;

import org.springframework.stereotype.Repository;

import com.hemant.aspect.entity.Account;

@Repository
public class AccountDAO {
	//method that will do some db stuff
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " DOING SOME DATABSE STUFF!!!");
	}
	
	//another method
	public boolean doWork() {
		System.out.println("Inside the doWork() method.");
		return true;
	}
}
