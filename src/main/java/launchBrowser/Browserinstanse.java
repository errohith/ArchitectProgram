package launchBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import selenium.factory.WebDriverPool;

public class Browserinstanse {
	@Test
	public void multipleinstance () {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		options.setImplicitWaitTimeout(Duration.ofSeconds(300));
		WebDriver driver = WebDriverPool.DEFAULT.getDriver(options);
		driver.get("http://seleniumhq.org");
		driver = WebDriverPool.DEFAULT.getDriver(options);
		driver.get("https://www.google.com/");
//		WebDriverPool.DEFAULT.dismissDriver(driver);
	}
}
