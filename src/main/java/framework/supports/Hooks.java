package framework.supports;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private ScenarioContext scenarioContext;

    public Hooks(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        scenarioContext.setDriver(driver);
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @After
    public void tearDown() {
        WebDriver driver = scenarioContext.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }

}