package com.webelement_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_and_Clear_text_from_Input_field 
{

	public static void main(String[] args) 
	{
		
	// Type 1 - Clearing the text
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).clear();
*/		
		
	
		
	// Type 1 - Entering the text and Submit

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//button[@class='_2AkmmA _1LctnI _7UHT_c']")).submit();
	}

}
