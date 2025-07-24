package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCommandsTogether{

    public static void main(String[] args) {
        performAllActions("https://opensource-demo.orangehrmlive.com/");
        performAllActions("https://demo.opencart.com/");
        performAllActions("http://www.bing.com");
        performAllActions("https://www.freecrm.com/");
        performAllActions("http://www.half.ebay.com/");
    }

    public static void performAllActions(String url) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
            driver.manage().window().maximize();

            System.out.println("=== Performing actions for: " + url + " ===");

            printTitle(driver);
            printCurrentUrl(driver);
            printPageSource(driver);

            System.out.println("\n====================================\n");
        } catch (Exception e) {
            System.out.println("Error while handling: " + url);
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    public static void printTitle(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

    public static void printCurrentUrl(WebDriver driver) {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
    }

    public static void printPageSource(WebDriver driver) {
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());
  
        // System.out.println(pageSource);
    }
}
