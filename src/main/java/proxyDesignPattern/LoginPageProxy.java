package proxyDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

public class LoginPageProxy {
	
	static Logger log = Logger.getLogger(LoginPageProxy.class);
	
	public LoginPageProxy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using = "username")
	private WebElement eleUsername;
	
	@FindBy(how=How.ID, using = "password")
	private WebElement elePassword;
	
	@FindBy(how=How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement eleLogin;
	
	public LoginPageProxy typeUserName(String user) {

		new LogWebElement(eleUsername).sendKeys(user);
		log.info("UserName Is entered");
		return this;
	}
	
	public LoginPageProxy typePassword(String Password) {
		new LogWebElement(elePassword).sendKeys(Password);
		log.info("Password Is entered");
		return this;
	}
	
	public LoginPageProxy ClickLogin() {
		new LogWebElement(eleLogin).click();
		log.info("Login Button Is Clicked");
		return this;
	}


}
