package com.Vtiger.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriceTestdata {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi note 10 pro");
		driver.findElement(By.cssSelector("button[type='Submit']")).click();
		Thread.sleep(3000);
		String str=driver.findElement(By.xpath("//div[.='REDMI Note 10 Pro (Dark Nebula, 128 GB)']")).getText();
		System.out.println(str);

		String str1=driver.findElement(By.xpath("//div[text()='₹16,999']/ancestor::div[@class='_13oc-S']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		String newprice =	str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newprice);

		
		driver.close();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in/");
		driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi note 10 pro");
		driver1.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String str2=driver1.findElement(By.xpath("//span[text()='Redmi Note 10 Pro (Dark Night, 6GB RAM, 128GB Storage) -120hz Super Amoled Display|64MPwith 5mp Super Tele-Macro | 33W Charger Included']")).getText();
		System.out.println(str2);
		Thread.sleep(2000);
		String str3=driver1.findElement(By.xpath(("//span[text()='Redmi Note 10 Pro (Glacial Blue, 6GB RAM, 128GB Storage) -120hz Super Amoled Display|64MP with 5mp Super Tele- Macro | 33W Charger Included']/ancestor::div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']//span[@class='a-price-whole']"))).getText();
		String newprice2 =	str3.replaceAll("[^a-zA-Z0-9]", "");


		int a=Integer.parseInt(newprice);

		int b = Integer.parseInt(newprice2);

		System.out.println(a);

		System.out.println(b);

		if(a>=b)
		{
			System.out.println("amazon is cheaper");
		}
		else {
			System.out.println("Flipkart is cheaper");
		}
		
	}

}
