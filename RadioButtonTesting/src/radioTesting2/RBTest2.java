package radioTesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RBTest2 {
	@Test
	public void RBlaunch() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/flights.html?msclkid=96be5beab8ac15801f39336dba7e8e80&utm_source=bing&utm_medium=cpc&utm_campaign=Bing_Search_AllAudience_%20Brand%20(EaseMyTrip.Com)&utm_term=easemytrip&utm_content=EaseMyTrip%20Exact");
		
//		driver.findElement(By.cssSelector("//label[normalize-space()='Female']")).click();
//		driver.findElement(By.cssSelector("//label[normalize-space()='Male']")).click();
		Thread.sleep(3000);
		
		int radiobtn=driver.findElements(By.xpath("//label[normalize-space()='Defence Forces']")).size();
		System.out.println("Number of radio buttons:" + radiobtn);
		driver.quit();

}
}

