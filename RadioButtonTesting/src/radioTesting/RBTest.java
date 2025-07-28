package radioTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RBTest {
	@Test
	public void RBlaunch() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?");
		
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(3000);
		
		int radiobtn=driver.findElements(By.xpath("//input[@name='sex']")).size();
		System.out.println("Number of radio buttons:" + radiobtn);
		driver.quit();

}
}
