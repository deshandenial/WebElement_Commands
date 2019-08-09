package com.webelement_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_Click_action_works_differently_on_different_elements 
{
public static void main(String[] args) 
 {
	
// Type 1 click() method
	/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();*/
	
// Type 2 submit() method
	
	/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//button[@class='_2AkmmA _1LctnI _7UHT_c']")).submit();*/
	
	
// Type 3 return and enter key method
	
	/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//button[@class='_2AkmmA _1LctnI _7UHT_c']")).sendKeys(Keys.RETURN);
	// (OR)
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//button[@class='_2AkmmA _1LctnI _7UHT_c']")).sendKeys(Keys.ENTER);*/
	
	
// Type 4 - One  Using JavascriptExecutor
	
	/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	WebElement SignIn=driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	JavascriptExecutor js = (JavascriptExecutor)driver; 
    js.executeScript("arguments[0].click();", SignIn);*/
    
 // Type 4 - One  Using JavascriptExecutor By DOM
    
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@type='text']")).sendKeys("deshan");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor) driver; 
    js.executeScript("document.getElementsByClassName('_2AkmmA _1LctnI _7UHT_c')[0].click()");
    
    // id,name,class,
	
 }
	
}
