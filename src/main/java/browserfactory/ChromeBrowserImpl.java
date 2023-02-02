package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserImpl implements Browser{

	WebDriver driver;
	@Override
	public WebDriver launch() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
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
