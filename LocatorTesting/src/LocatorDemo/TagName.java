package LocatorDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TagName {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(WebElement ele:allLinks) {
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.getAttribute("href"));
		}
	}
}
