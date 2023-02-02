package bridge;

public class BrowserFactory {
	
	public static Browser getBrowser(BrowserType browser_type) {
		
		if(browser_type == BrowserType.CHROME) {
			return new ChromeBrowserImpl();
		}else if(browser_type == BrowserType.EDGE) {
			return new EdgeBrowserImpl();
		}
		return null;
		
	}

}
