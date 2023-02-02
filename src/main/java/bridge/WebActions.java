package bridge;

import browserfactory.Browser;

public interface WebActions {
	
	public void launch(String url, BrowserType browser1);
	public void type(String locator, String text);
	public void click(String locator);
	public String getText(String locator);
	public void close();
	public void verifytext(String locator);

}
