//package LocatorDemo;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;
//
//public class LDemo {
//	WebDriver driver;
//	
//	@Test
//	public void DemoTestID() throws Exception {
//	
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
//		driver=new EdgeDriver();
//		driver.get("https://www.bing.com/?FORM=Z9FD1");
//		driver.findElement(By.id("sb_form_q")).sendKeys(" easy calculation");
//		driver.findElement(By.id("//label[@id='search_icon']//*[name()='svg']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Free Online Math Calculator and Converter']")).click();
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
//		driver.findElement(By.id("username")).sendKeys("aaditya@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("aaditya");
//		driver.findElement(By.xpath("//button[@name='action']")).click();
//		Thread.sleep(5000);
//		driver.quit();
//
//}
//}
