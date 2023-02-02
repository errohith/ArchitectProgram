package decoratorPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDecoratorClick {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		WebElement findElement = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		ElementDecorator elementDecorator = new ElementDecorator(driver, findElement);
		elementDecorator.click();
		
	}
	
		
}
