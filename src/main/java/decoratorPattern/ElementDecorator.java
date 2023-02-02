package decoratorPattern;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDecorator extends RemoteWebElement {
	
	private WebElement ele;
	private WebDriverWait wait;

	
	public ElementDecorator(WebDriver driver, WebElement ele) {
		
		this.ele = ele;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void click() {
		waitforClick();
		ele.click();
		
	}

	private void waitforClick() {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	
	
	

}
