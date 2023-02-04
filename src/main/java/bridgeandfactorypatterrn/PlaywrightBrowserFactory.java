package bridgeandfactorypatterrn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import org.openqa.selenium.edge.EdgeDriver;

public class PlaywrightBrowserFactory {

    public static Browser browserFactory(
            BrowserTypes type, Playwright pw) {
        switch(type) {
            case Chrome:
                return pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
            case Firefox:
                return pw.firefox().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
            default:
                return null;
        }
    }

}
