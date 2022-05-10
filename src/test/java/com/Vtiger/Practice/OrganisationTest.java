package com.Vtiger.Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Vtiger.generic.TestdataTest;
import com.Vtiger.generic.WebdriverUtilTest;
import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganisationTest extends Browser {

	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriverManager.chromedriver().setup();

			ChromeDriver driver = new ChromeDriver();
	    
			driver.get("http://localhost:8888");
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).submit();
			
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		WebdriverUtilTest wdu=new WebdriverUtilTest(driver);
		wdu.pageloadtimeout();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		 TestdataTest td=new TestdataTest();
		String orgname = td.getOrganizationName();
		driver.findElement(By.name("accountname")).sendKeys("orgname2");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
		
			//	WebElement wa = driver.findElement(By.xpath("//a[text()='Organizations']"));
			//	wdu.scrolltoelement(wa);
				
			//	wa.click();
				
		
				}

}