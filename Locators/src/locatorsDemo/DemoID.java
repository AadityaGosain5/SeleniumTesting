package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoID {
	WebDriver driver;
	
	@Test
	public void DemoTestID() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("aaditya@gmail.com");
		driver.findElement(By.name("password")).sendKeys("aaditya");
		driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
}
