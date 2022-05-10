package com.Vtiger.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Signout {
	WebDriver driver;
	public Signout(WebDriver driver)
	{
		this.driver=driver;
	}
  @FindBy(xpath="//a[text()='WebDriver driver']")
  private WebElement orglink;
  
  @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
  private WebElement singoutimg;
  
  @FindBy(xpath="//a[text()='Sign Out']")
  private WebElement signoutbtn;
  
  public WebElement getOrglink() {
	return orglink;
}

public WebElement getSingoutimg() {
	return singoutimg;
}

public WebElement getSignoutbtn() {
	return signoutbtn;
}
WebDriverUtil wdu=new WebDriverUtil(driver);
public void signout()
{
	wdu.moveToelement(singoutimg);
	signoutbtn.click();
	}
}