package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebDriver driver2 = new ChromeDriver();
		String URL =driver.getCurrentUrl();
		System.out.println(URL);
		
		driver2.get("https://demo.opencart.com/");
		WebDriver driver3 = new ChromeDriver();
		String URL2 =driver2.getCurrentUrl();
		System.out.println(URL2);
		
		driver3.get("http://www.bing.com");
		WebDriver driver4 = new ChromeDriver();
		String URL3=driver3.getCurrentUrl();
		System.out.println(URL3);
		
		driver4.get("https://www.freecrm.com/");
		WebDriver driver5 = new ChromeDriver();
		String URL4 =driver4.getCurrentUrl();
		System.out.println(URL4);
		
		driver5.get("http://www.half.ebay.com/");
		driver.manage().window().maximize();
		String URL5 =driver5.getCurrentUrl();
		System.out.println(URL5);
	}

}
