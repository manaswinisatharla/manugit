package com.Testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	@Test
	public void screenschnt() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		TakesScreenshot Screenshot =(TakesScreenshot)driver;
		String dest="C:\\Users\\DELL\\Desktop\\testyantra\\TYSS_Manu\\Screenshot\\Vtiger.png";
				File src=Screenshot.getScreenshotAs(OutputType.FILE);
				File destpath=new File(dest);
				Files.copy(src,destpath);
		
	}

}
