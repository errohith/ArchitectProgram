package bridgeandfactorypatterrn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBrowserFactory {

    public static WebDriver browserFactory(
            BrowserTypes type) {
        switch(type) {
            case Chrome:
                return new ChromeDriver();
            case Firefox:
                return new FirefoxDriver();
            case Edge:
                return new EdgeDriver();
            default:
                return null;
        }
    }

}
