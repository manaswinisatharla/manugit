package com.Vtiger.Practice;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Vtiger.generic.ReadpropertyfileTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {

		
		// TODO Auto-generated method stub
		//public static void main(String[] args) throws EncryptedDocumentException, IOException {
		public static	WebDriver driver;
	public void OpenBrowser() throws Throwable {

		//public static	WebDriver driver;

			Properties prop = new Properties();
			ReadpropertyfileTest readpropertiesfileTest= new ReadpropertyfileTest();
		
			String BROWSER=	readpropertiesfileTest.readDatafrompropertyfile("browser");
					System.out.println(BROWSER);

			if (BROWSER.equalsIgnoreCase("chrome")) 
			{
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();

			}
			else if (BROWSER.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
			}
			else
			{
				System.out.println("No Browser Provided Launching Default browser");
				driver= new ChromeDriver();
			}

			driver.get(readpropertiesfileTest.readDatafrompropertyfile("url"));

			driver.findElement(By.name("user_name")).sendKeys(readpropertiesfileTest.readDatafrompropertyfile("username"));
			driver.findElement(By.name("user_password")).sendKeys(readpropertiesfileTest.readDatafrompropertyfile("password"));


		}

		
		
		
		
		
		
	
	}


