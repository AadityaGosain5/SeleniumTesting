package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDropDown {
	@Test
	public void FBlaunch() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?%22");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		
		List<WebElement> month_list=month_dd.getOptions();
		int totalmonths=month_list.size();
		
		System.out.println("No. of months : " + totalmonths);
		
		for(WebElement ele: month_list) {
			String month_name=ele.getText();
			System.out.println("Months Names are :" + month_name);
		}
		driver.quit();
//		month_dd.selectByIndex(8);
//		Thread.sleep(3000);
//		
//		month_dd.selectByValue("10");
//		Thread.sleep(3000);
//		
//		month_dd.selectByVisibleText("Dec");
//		Thread.sleep(3000);
//		driver.quit();
	}

}
