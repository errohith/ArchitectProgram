package bridgeandfactorypatterrn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class WebDriverImpl implements WebActions {

    private WebDriver driver;

    public WebDriverImpl(BrowserTypes type) {
        driver = WebDriverBrowserFactory.browserFactory(type);
    }

    @Override
    public void launch(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private WebElement getElement(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    @Override
    public void type(String locator, String text) {
       new SeleniumElementDecorator(driver, getElement(locator)).sendKeys(text);
    }

    @Override
    public void click(String locator) {
        new SeleniumElementDecorator(driver, getElement(locator)).click();
    }

    @Override
    public String getText(String locator) {
        return new SeleniumElementDecorator(driver, getElement(locator)).getText();
    }

    @Override
    public void close() {
        driver.close();
    }
}
