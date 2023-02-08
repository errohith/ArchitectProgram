package ChainOfActionPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrmPage implements CreateLeadFunction{
	private CreateLeadFunction nextprocess;
	private WebDriver driver;
	
	CrmPage(WebDriver driver){
		this.driver = driver;
	}
	
			
	public void createLead(CreateLeadFunction nextProcess) {
		this.nextprocess = nextProcess;
	}


	@Override
	public boolean process() {
		System.out.println("CRM Page");
	
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		return nextprocess.process();
	}
	
	
}