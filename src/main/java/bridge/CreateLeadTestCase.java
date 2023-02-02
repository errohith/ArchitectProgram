package bridge;

import browserfactory.Browser;
import browserfactory.BrowserFactory;
import browserfactory.BrowserType;

public class CreateLeadTestCase {
	
	public static void main(String[] args) {
		
//		Browser browser = BrowserFactory.getBrowser(BrowserType.CHROME);
		WebActions impl  = DriverFactory.driverFactory(DriverTypes.Webdriver);
		impl.launch("http://leaftaps.com/opentaps", bridge.BrowserType.FIREFOX);
		impl.type("//input[@id='username']", "demosalesmanager");
		impl.type("//input[@id='password']", "crmsfa");
		impl.click("//input[@class='decorativeSubmit']");
		impl.click("//div[@for=\"crmsfa\"]");
		impl.click("//a[text()=\"Leads\"]");
		impl.click("//a[text()=\"Create Lead\"]");
		impl.type("//input[@id='createLeadForm_companyName']", "testleaf");
		impl.type("//input[@id='createLeadForm_firstName']", "Rohith");
		impl.type("//input[@id='createLeadForm_lastName']", "Kumar");
		impl.click("//input[@value='Create Lead']");
		impl.close();
	}

}
