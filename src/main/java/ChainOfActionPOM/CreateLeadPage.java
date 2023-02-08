package ChainOfActionPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLeadPage implements CreateLeadFunction{

	private CreateLeadFunction nextprocess;
	private WebDriver driver;
	
	CreateLeadPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void createLead(CreateLeadFunction nextProcess) {
		// TODO Auto-generated method stub
		this.nextprocess = nextProcess;
	}


	@Override
	public boolean process() {
		System.out.println("Create Lead Page");
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Group");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Group");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("6");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Group7");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("group6@testleaf.com");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.close();
		return nextprocess.process();
	}
	
	
}