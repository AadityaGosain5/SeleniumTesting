package LocatorDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class LinkTextandPartialLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.findElement(By.partialLinkText("Vitamins")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int nolinks=links.size();
		System.out.println("No. of links in hollandandbarrett app: " +nolinks);
		
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			String str =links.get(i).getText();
			
			String str1="Vitamins";
			
			if(str==str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("//a[@aria-label='Vitamins & Supplements']")).click();
			}
		}
}
}