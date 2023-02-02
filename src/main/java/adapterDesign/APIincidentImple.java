package adapterDesign;

import org.openqa.selenium.WebDriver;

import io.restassured.RestAssured;

public class APIincidentImple implements ServiceNow {

	@Override
	public WebDriver launch() {
		return null;

	}

	@Override
	public void login(String url) {
		RestAssured.baseURI = "https://dev81591.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "Test@123");
		
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