package com.Vtiger.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {
 public static void main(String []args) throws Throwable  {
	 
	 WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

	 
	 driver.get("https://www.flipkart.com");
	 driver.findElement(By.xpath("//button[.='✕']")).click();
	// driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	 WebElement ddAddr=driver.findElement(By.name("q"));
   ddAddr.sendKeys("mobiles");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div[.='POCO M3 Pro 5G (Yellow, 64 GB)']/ancestor::div[@class=\"_2kHMtA\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]")).click();
   Set<String> str=driver.getWindowHandles();
 		System.out.println(str);
 		Iterator<String> iterator=str.iterator();
 		String pw=iterator.next();
 		String cw=iterator.next();
 		driver.switchTo().window(cw);
 		WebElement val = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
 		System.out.println("before add: "+val.getText());
 		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
 		driver.switchTo().window(pw);
 		Thread.sleep(2000);
// 		d.findElement(By.xpath("//span[.='Cart']")).click();   //span[.='Cart']
 	    driver.manage().window().maximize();
 		driver.findElement(By.xpath("//span[.='Cart']")).click();
 		Thread.sleep(2000);
 		 WebElement add = driver.findElement(By.xpath("//button[text()='+']"));
 	   //  Point loc = add.getLocation();
 		 org.openqa.selenium.Point loc=add.getLocation();
 		JavascriptExecutor jse=(JavascriptExecutor)driver;
 	    jse.executeScript("window.scrollBy"+loc);
 	    
 	     add.click();
 	     Thread.sleep(4000);
 	     WebElement val2 = driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']"));
 	     System.out.println("After adding: "+val2.getText());
 	     driver.quit();
 	    
 		
 	}

 	
 }
  // Set<String>AllWindowHandles=driver.getWindowHandles();
//   System.out.println(AllWindowHandles);
//   Iterator<String>iterator=AllWindowHandles.iterator();
//   AllWindowHandles.iterator();
 //  String ParentWindow=iterator.next();
 //  System.out.println("ParentWindow"+driver.getTitle());
//   String ChildWindow=iterator.next();
//   System.out.println("ChildWindow"+driver.getTitle());
   //For Switch To child window
 //  driver.switchTo().window(ChildWindow);
 //   WebElement v= driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]"));
 //   System.out.println(v.getText());
    
   //For Switch To child window
  // driver.findElement(By.xpath("//div[.='Login']")).click();
// driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
 //     JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollBy());
// driver.findElement(By.className("//button[@class=\"_23FHuj\"]")).click();

   
   
   
