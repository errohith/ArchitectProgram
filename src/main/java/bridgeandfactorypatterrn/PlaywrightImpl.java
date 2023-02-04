package bridgeandfactorypatterrn;

import com.microsoft.playwright.*;

public class PlaywrightImpl implements WebActions {

    private Playwright pw;
    private Browser browser;
    private Page page;

    public PlaywrightImpl(BrowserTypes types) {
        pw = Playwright.create();
        browser = PlaywrightBrowserFactory.browserFactory(types, pw);
    }

    @Override
    public void launch(String url) {
        page = browser.newPage();
        page.navigate(url);
    }

    private Locator getElement(String locator) {
        return page.locator(locator);
    }

    @Override
    public void type(String locator, String text) {
        new PlaywrightElementDecorator(page, getElement(locator)).sendKeys(text);
    }

    @Override
    public void click(String locator) {
       new PlaywrightElementDecorator(page, getElement(locator)).click();
    }

    @Override
    public String getText(String locator) {
        String text = new PlaywrightElementDecorator(page, getElement(locator)).getText();
        return text;
    }

    @Override
    public void close() {
        pw.close();
    }
}
