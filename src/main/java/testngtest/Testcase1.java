package testngtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
		@BeforeTest

	public void createDBconnection() {
		System.out.println("create connection");
	}
		@AfterTest

		public void AfterDBconnection() {
			System.out.println("close connection");
		}
		
	@BeforeMethod
	public void launchBrowser(){
		System.out.println("launching browser");
		}
	
	@AfterMethod
	public void CloseBrowser(){
		System.out.println("Closing browser");
		}
	
	@Test(priority = 1)
	public void dologin() {
		System.out.println("Executing login-test");
	}
	
	
		@Test(priority = 2)
		public void douserreg() {
			System.out.println("Executing douserregtest");
		}
		

}
