package com.webelement_commands;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Strategy_to_check_dead_links_on_the_page 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		links.addAll(driver.findElements(By.tagName("img")));
		
		 //To print the total number of links
		 System.out.println("Total links are "+links.size()); 
		 //used for loop to 
		 for(int i=0; i<links.size(); i++) {
		 WebElement element = links.get(i);
		 //By using "href" attribute, we could get the url of the requried link
		 
		 String url1=element.getText();
		String url2=element.getAttribute("href");
		 //calling verifyLink() method here. Passing the parameter as url which we collected in the above link
		 //See the detailed functionality of the verifyLink(url) method below
		 verifyLink(url1,url2); 
		 } 
		 }
		 
		 private static void verifyLink(String url1, String url2) 
		 {
			 try {
				 //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
				 URL link1 = new URL(url2);
				 URL link2 = new URL(url2);
				 // Create a connection using URL object (i.e., link)
				 //HttpURLConnection httpConn2 =(HttpURLConnection)link1.openConnection();
				
				 HttpURLConnection httpConn =(HttpURLConnection)link2.openConnection();
				 //Set the timeout for 2 seconds
				 httpConn.setConnectTimeout(2000);
				 //connect using connect method
				 httpConn.connect();
				 //use getResponseCode() to get the response code. 
				 if(httpConn.getResponseCode()== 200) 
				 { 
					 
				 System.out.println(url1+" - "+url2+" - "+httpConn.getResponseMessage());
				 }
				 if(httpConn.getResponseCode()== 404) 
				 {
				 System.out.println(url1+" - "+url2+" - "+httpConn.getResponseMessage());
				 }
				 }
				 //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
				 catch (Exception e) {
				 //e.printStackTrace();
				 }

		
		
	}

		
		

}
