package com.webelement_commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_all_links_on_the_Page 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MINUTES);
		System.out.println("Total number of  links:"+allLinks.size());
		
		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks)
		{
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
		}
		
	

	}

}
