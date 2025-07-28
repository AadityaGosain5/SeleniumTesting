package AlertPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Rediffmail {
	@Test
	public void TestPopups() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		}else {
			System.out.println("in-correct alert message");
		}
		alert.accept();
	}
	
}


