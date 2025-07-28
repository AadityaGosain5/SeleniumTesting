package AlertPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlyTesting {

	@Test
	public void TestPopups() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("FirstName")).sendKeys("aaditya");
		driver.findElement(By.name("LastName")).sendKeys("gosain");
		driver.findElement(By.name("EmailID")).sendKeys("gosain@gmail.com");
		driver.findElement(By.name("MobNo")).sendKeys("539509788");
		driver.findElement(By.name("Company")).sendKeys("oracle");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String result=driver.findElement(By.xpath("//a[normalize-space()='Only Testing']")).getText();
		System.out.println(result);

		
	}
}
