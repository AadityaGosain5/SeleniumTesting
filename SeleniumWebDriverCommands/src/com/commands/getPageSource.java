package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSource {

    public static void main(String[] args) {
        printPageSource("https://opensource-demo.orangehrmlive.com/");
        printPageSource("https://demo.opencart.com/");
        printPageSource("http://www.bing.com");
        printPageSource("https://www.freecrm.com/");
        printPageSource("http://www.half.ebay.com/");
    }

    public static void printPageSource(String url) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();
            System.out.println("==== Page Source for: " + url + " ====");
            System.out.println(driver.getPageSource());
            System.out.println("\n========================================\n");
        } catch (Exception e) {
            System.out.println("Error loading URL: " + url);
            e.printStackTrace();
        } finally {
            driver.quit(); 
        }
    }
}

