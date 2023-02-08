package ChainOfActionPOM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage implements CreateLeadFunction{

	private CreateLeadFunction nextprocess;
	private WebDriver driver;
	
	LoginPage(WebDriver driver){
		this.driver = driver;
	}
	

	public void createLead(CreateLeadFunction nextProcess) {
		// TODO Auto-generated method stub
		this.nextprocess = nextProcess;
	}

	public boolean process() {
		
		System.out.println("Login Page");
		 
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		return nextprocess.process();
				
	}

}