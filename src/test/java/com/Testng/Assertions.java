package com.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	@Test
	public void org() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		WebElement un=driver.findElement(By.name("user_name"));
		boolean value=un.isDisplayed();
		Assert.assertEquals(value, true);
		un.sendKeys("admin");

		
		WebElement pwd=driver.findElement(By.name("user_password"));
		boolean pwdvalue=un.isDisplayed();
		
Assert.assertEquals(pwdvalue, true);
pwd.sendKeys("admin");
	}

}
