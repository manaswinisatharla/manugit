package com.Vtiger.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Vtiger.generic.WebdriverUtilTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleUtil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.in");

		WebdriverUtilTest driverUtil = new WebdriverUtilTest(driver);

		driverUtil.maxwindow();

		driverUtil.pageloadtimeout();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles"+Keys.ENTER);


		driver.findElement(By.xpath("//span[.='realme narzo 50i (Mint Green, 4GB RAM+64GB Storage) - with No Cost EMI/Additional Exchange Offers']")).click();


		driverUtil.switchWindow("realme narzo 50i (Mint Green, 4GB RAM+64GB Storage) - with No Cost EMI/Additional Exchange Offers : Amazon.in: Electronics");

		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("attach-accessory-cart-subtotal")).getText());


		driverUtil.switchWindow("Amazon.in : Mobiles");

	}

}