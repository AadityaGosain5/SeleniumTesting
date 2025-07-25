package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationdemo {

    public static void main(String[] args) {
     
        WebDriver driver = new ChromeDriver();

     
        driver.manage().window().maximize();

      
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        driver.navigate().to("https://demo.opencart.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

       
        driver.navigate().to("http://www.bing.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());


        driver.navigate().to("https://www.freecrm.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

      
        driver.navigate().to("http://www.half.ebay.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

       
        driver.navigate().back();
        System.out.println("After Back: " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("After Back Again: " + driver.getCurrentUrl());

        
        driver.navigate().forward();
        System.out.println("After Forward: " + driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println("Page Refreshed");

        
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        driver.quit();
    }
}
