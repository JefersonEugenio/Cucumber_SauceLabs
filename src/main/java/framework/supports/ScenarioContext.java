package framework.supports;

import org.openqa.selenium.WebDriver;

public class ScenarioContext {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}
