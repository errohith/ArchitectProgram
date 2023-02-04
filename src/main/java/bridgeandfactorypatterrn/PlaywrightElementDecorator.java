package bridgeandfactorypatterrn;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaywrightElementDecorator {

    private Locator locator;
    private Page page;

    public PlaywrightElementDecorator(Page page, Locator locator) {
        this.locator = locator;
        this.page = page;
    }

    private void highlight() {

    }

    private void removeHighlight() {

    }

    public void click() {
        System.out.println("Waiting for element");
        locator.waitFor();
        highlight();
        locator.click();
        try {
            removeHighlight();
        } catch (Exception e) {

        }
    }

    public void sendKeys(String value) {
        System.out.println("Waiting for element");
        locator.waitFor();
        highlight();
        locator.type(value);
        try {
            removeHighlight();
        } catch (Exception e) {

        }
    }

    public String getText() {
        System.out.println("Waiting for element");
        locator.waitFor();
        return locator.innerText();
    }
}
