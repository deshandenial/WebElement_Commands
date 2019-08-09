package com.webelement_commands;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Difference_between_FindElement_FindElements {

	public static void main(String[] args)
	{
		
		
	//Type 1: FindElement() Method
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']//span[contains(text(),'Electronics')]"));
		element.click();*/
		
		
	//Type 1: FindElements() Method
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		List<WebElement> menus=driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		System.out.println("Total No.Of Menus:"+menus.size());
		Iterator<WebElement> iterator=menus.iterator();
		while (iterator.hasNext()) 
		{
			WebElement webElement = (WebElement) iterator.next();
			String label=webElement.getText();
			System.out.println("Name list:"+label);
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			webElement.click();
			
		}
		
		
	}

}
