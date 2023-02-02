package adapterDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIIncidentImpl implements ServiceNow {

	WebDriver driver;
	@Override
	public WebDriver launch() {
		driver = new ChromeDriver();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(String url) {
		driver.get(url);
		// TODO Auto-generated method stub
		driver.findElement(By.name("USERNAME")).sendKeys("admin");
		driver.findElement(By.name("PASSWORD")).sendKeys("+XVujQj=G2p9");
		driver.findElement(By.name("SUBMIT")).click();
		
	}

	@Override
	public void createIncident(String Inc, String Short) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getIncident(String Number) {
		// TODO Auto-generated method stub
		
	}


}
