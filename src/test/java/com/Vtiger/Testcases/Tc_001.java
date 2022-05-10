package com.Vtiger.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Vtiger.generic.ExcelutilityTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_001 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		ExcelutilityTest excelUtility=new ExcelutilityTest();
		String un=excelUtility.readDatafromExcel("Sheet2", 0, 0);
		int pwd=excelUtility.readNumericDatafromExcel("Sheet2", 1, 0);
		System.out.println(un);
		System.out.println(pwd);
		
		String password=Integer.toString(pwd);
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		
		
	}

}
