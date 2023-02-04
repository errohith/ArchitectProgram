package bridgeandfactorypatterrn;

public class DriverFactory {

    public static WebActions driverFactory(DriverTypes type, BrowserTypes browserTypes) {
        switch(type) {
            case Playwright:
                return new PlaywrightImpl(browserTypes);
            case WebDriver:
                return new WebDriverImpl(browserTypes);
            default:
                return null;
        }
    }

}
