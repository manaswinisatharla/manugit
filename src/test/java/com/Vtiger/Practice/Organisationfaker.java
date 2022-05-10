package com.Vtiger.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Vtiger.generic.TestdataTest;
import com.Vtiger.generic.WebdriverUtilTest;

public class Organisationfaker extends Browser1 {

			public static void main(String[] args) throws Throwable {
				Browser1 b=new Browser1();
			    b.OpenBrowser();
			   
			    driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			    WebdriverUtilTest wdu=new WebdriverUtilTest(driver);
			    wdu.pageloadtimeout();
			    wdu.maxwindow();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				TestdataTest td=new TestdataTest();
				String orgname=td.getOrganizationName();
				driver.findElement(By.name("accountname")).sendKeys(orgname);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				Thread.sleep(4000);
			        WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
			        wdu.moveToelement(logout);
			       
			        driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();

				    
				    Browser1 b1=new Browser1();
				    b1.OpenBrowser();
				    driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				    
				    WebdriverUtilTest wdu2=new WebdriverUtilTest(driver);
				    wdu2.pageloadtimeout();
				    wdu2.maxwindow();
				    driver.findElement(By.name("search_text")).sendKeys(orgname);
					WebElement dd4value = driver.findElement(By.id("bas_searchfield"));
					 wdu2.selectValuefromdd("Organization Name", dd4value);
					 driver.findElement(By.xpath("(//input[@class='crmbutton small create'])[1]")).click();
				   String text = driver.findElement(By.xpath("(//td[@onmouseover=\"vtlib_listview.trigger('cell.onmouseover', $(this))\"])[2]")).getText();
				 System.out.println(text);
				    if(orgname.equalsIgnoreCase(text))
				    {
				    	System.out.println("verified successfully");
				    }
				    else
				    {
				    	System.out.println("name not matched or not created ");
				    }
				}
	}