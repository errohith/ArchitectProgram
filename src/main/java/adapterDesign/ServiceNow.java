package adapterDesign;

import org.openqa.selenium.WebDriver;

public interface ServiceNow {

	public WebDriver launch();
	public void login(String url);
	public void createIncident(String Inc, String Short);
	public void getIncident(String Number);
}
