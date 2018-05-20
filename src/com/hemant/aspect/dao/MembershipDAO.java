package com.hemant.aspect.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAO {
	//This class also has a method called doSomeStuff()
	
	public boolean addSillyMember() {
		System.out.println(getClass() + " DOING SOME CRAZY STUFF! ADDING A NEW MEMBERSHIP ACCOUNT");
		return true;
	}
	
	public void goToSleep() {
		System.out.println("Inside the goToSleep() method.");
	}
}
