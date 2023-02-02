package bridge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class EdgeBrowserImpl implements Browser{

	WebDriver driver;
	@Override
	public WebDriver launch() {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		return driver;
	}

	@Override
	public void navigate(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

}
