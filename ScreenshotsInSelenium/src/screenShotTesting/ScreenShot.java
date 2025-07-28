package screenShotTesting;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
	public void RBlaunch() throws Exception{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\AADITYA GOSAIN\\spring-workspace333zzzzzz\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/FacebookHomepage.png"));
		System.out.println("Captured ScreenShot");
		driver.quit();
	}
}
