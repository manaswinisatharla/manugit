package com.Vtiger.Practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BrowserLAunch {

		public static void main(String[] args) throws InterruptedException {

			
			Date date = new  Date();
			
			String currentdate=date.toString();
			
			//Thur Apr 28 18:09:03 IST 2022
			// 0   1   2    3      4    5 
			// Thur Apr 28 2022
			
			String[] arr = currentdate.split(" ");
			
			String day= arr[0];
			String month= arr[1];
			String dt= arr[2];
			String year = arr[5];
			
			String xpath= day+" "+month+" "+dt+" "+year;
			
			
			System.out.println(xpath);
			
			
			
			
			
			
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.makemytrip.com/");

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
			
			driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
			
			
			driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@aria-label='"+xpath+"']")).click();
			
		}

	}
	