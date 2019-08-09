package com.webelement_commands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extracting_More_than_one_object_from_a_page 
{
	private static String[] links = null;
	private static int linksCount = 0;
	public static void main(String[] args) throws Exception
	{
				
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		List<WebElement> linksize = driver.findElements(By.tagName("a")); 
		linksize.addAll(driver.findElements(By.tagName("img")));
		linksCount = linksize.size();
		System.out.println("Total no of links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from webpage 
		for(int i=0;i<linksCount;i++)
		{
		links[i] = linksize.get(i).getAttribute("href");
		System.out.println(linksize.get(i).getAttribute("href"));
		} 
		// navigate to each Link on the webpage
		for(int i=0;i<linksCount;i++)
		{
		driver.navigate().to(links[i]);
		Thread.sleep(3000);
		}
	}

}
