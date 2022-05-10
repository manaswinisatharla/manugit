package com.Vtiger.generic;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="user_name")
	private WebElement untb;
	
	@FindBy(name="user_password")
	private WebElement pwdtb;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwdtb() {
		return pwdtb;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	ProppertyFiles pf=new ProppertyFiles();
	
public void loginToAPp() throws Throwable  
{
	untb.sendKeys(pf.readDatafrompropertyfile("username"));
	pwdtb.sendKeys(pf.readDatafrompropertyfile("password"));
	loginbtn.click();
}
}
