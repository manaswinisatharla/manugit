package com.Vtiger.Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Vtiger.generic.TestdataTest;
import com.Vtiger.generic.WebdriverUtilTest;
import com.github.dockerjava.api.model.Driver;
import com.sun.org.apache.bcel.internal.generic.Select;



public class Organisationindustry  extends Browser1  {

	public static void main(String[] args) throws Throwable  {
    		Browser b=new Browser();
    		b.openBrowser();
    		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
    	  	  Thread.sleep(2000);
    	  	WebdriverUtilTest w=new WebdriverUtilTest(driver);
                    w.maxwindow();

    		         w.pageloadtimeout();
    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
    driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
    TestdataTest  testdata=new TestdataTest();
    String OrganizationName=testdata.getOrganizationName	();
    driver.findElement(By.name("accountname")).sendKeys(OrganizationName);
    
    driver.findElement(By.name("button")) 
      .click();
    Thread.sleep(2000);
       
    driver.findElement(By.xpath("//td[@class=\"tabSelected\"]"))
   .click();
   
  WebElement av=  driver.findElement(By.name("search_text"));
  av.sendKeys(OrganizationName);
    driver.findElement(By.name("search_field")).click();
	WebElement dr=driver.findElement(By.name( "search_field"));
	   w.selectValuefromdd(dr, 1);
	 WebElement a=  driver.findElement(By.name("submit"));
	 a.click();
	 
	    if(a.equals(OrganizationName)) {
		   System.out.println("passed");
	   }
		
		 else { 
			  System.out.println("Fail");
		  }
		 
	

				}
	}
