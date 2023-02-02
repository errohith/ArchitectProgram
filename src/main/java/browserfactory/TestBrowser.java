package browserfactory;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browser = BrowserFactory.getBrowser(BrowserType.CHROME);
		browser.launch();
		browser.navigate("https://amazon.in");
		browser.quit();

	}

}
