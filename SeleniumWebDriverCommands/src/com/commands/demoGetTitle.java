package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoGetTitle {

	public static void main(String[] args) {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebDriver driver2 = new ChromeDriver();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		driver2.get("https://demo.opencart.com/");
		WebDriver driver3 = new ChromeDriver();
		String Title2 =driver2.getTitle();
		System.out.println(Title2);
		
		driver3.get("http://www.bing.com");
		WebDriver driver4 = new ChromeDriver();
		String Title3=driver3.getTitle();
		System.out.println(Title3);
		
		driver4.get("https://www.freecrm.com/");
		WebDriver driver5 = new ChromeDriver();
		String Title4 =driver4.getTitle();
		System.out.println(Title4);
		
		driver5.get("http://www.half.ebay.com/");
		driver.manage().window().maximize();
		String Title5 =driver5.getTitle();
		System.out.println(Title5);
		
	
		driver.quit();
		}

}
