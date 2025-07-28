package AlertPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandling {

	@Test
	public void TestPopups() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert =driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		String result=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert", result);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 =driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		String result2=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Cancel", result2);
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 =driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.sendKeys("hello alert");
		alert3.accept();
		String result3=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You entered: hello alert", result3);
	
	}

}
