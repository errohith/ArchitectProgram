package bridgeandfactorypatterrn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumElementDecorator extends RemoteWebElement {

    private WebElement element;
    private JavascriptExecutor jse;
    private WebDriverWait wait;

    public SeleniumElementDecorator(WebDriver driver, WebElement element) {
        this.element = element;
        this.jse = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void highlight() {
        jse.executeScript("arguments[0].style.background='yellow'", element);
    }

    private void removeHighlight() {
        jse.executeScript("arguments[0].style.background=''", element);
    }

    private void waitFor() {
        System.out.println("Waiting for element");
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click() {
        waitFor();
        highlight();
        element.click();
        try {
            removeHighlight();
        } catch (Exception e) {

        }
    }

    public void sendKeys(CharSequence... keysToSend) {
        highlight();
        element.sendKeys(keysToSend);
        removeHighlight();
    }

    public String getText() {
        return element.getText();
    }
}
