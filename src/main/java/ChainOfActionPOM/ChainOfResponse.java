package ChainOfActionPOM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChainOfResponse {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options =  new ChromeOptions();

		ChromeDriver driver = new ChromeDriver(options);
		
		CreateLeadFunction login =  new LoginPage(driver);
		CreateLeadFunction crmf =  new CrmPage(driver);
		CreateLeadFunction create =  new CreateLeadPage(driver);
		
		login.createLead(crmf);
		crmf.createLead(create);
		login.process();
		
		

	}

}
