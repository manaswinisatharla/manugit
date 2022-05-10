package com.Testng;

import org.testng.annotations.Test;

public class Customer {
	@Test(priority=1)
	public void createCustomerTest() {
		System.out.println("execute HDFC createCustomerTest");
	}
	@Test(priority=2)
	public void ModifyCustomerTest() {
		System.out.println("execute HDFC ModifyCustomerTest");
	}
	@Test(priority=3)
	public void deleteCustomerTest() {
		System.out.println("execute HDFC deleteCustomerTest");
	}

}
