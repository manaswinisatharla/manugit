package testngtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test(groups="smokeGrp")
	 public void smoke1( ) {
    	Reporter.log("smoke1",true);
    }
	@Test(groups="ftGrp")
    public void ft1( ) {
    	Reporter.log("ft1",true);
	}
	
	public void validateTitles() {
	//	String expected_title="yahoo.com";
	//	String actual_title="gmail.com";
		
//		if(expected_title.equals(actual_title))
//		{
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase Fail");
//		}
		
		}

}
