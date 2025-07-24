package com.AllBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBrowserDemo {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebDriver driver2 = new ChromeDriver();
			driver2.get("https://demo.opencart.com/");
			WebDriver driver3 = new ChromeDriver();
			driver3.get("http://www.bing.com");
			WebDriver driver4 = new ChromeDriver();
			driver4.get("https://www.freecrm.com/");
			WebDriver driver5 = new ChromeDriver();
			driver5.get("http://www.half.ebay.com/");
			
		}
	}