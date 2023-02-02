package chromeoptions;

public class OptionsFactory {

	public static BrowserConfig getBrowserConfig(Options options) {
		switch (options) {
		case CHROME:
			return new ChromeBrowserOptions();
		case FIREFOX:
			return new FirefoxBrowserOptions();
		case EDGE:
			return new EdgeBrowserOptions();
		default:
			return null;
		}
	}

}