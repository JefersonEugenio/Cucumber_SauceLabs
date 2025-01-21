package framework.supports;

import com.aventstack.extentreports.Status;
import framework.tools.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static framework.tools.Report.extentTest;

public class Hooks {

    private ScenarioContext scenarioContext;

    public Hooks(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Before
    public void setUp() {
        Report.configurarExtentReport();
        Report.createTest("Sauce Labs com Cucumber");
        extentTest.log(Status.INFO, "Inicio de teste");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        scenarioContext.setDriver(driver);
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @After
    public void tearDown() {
        WebDriver driver = scenarioContext.getDriver();
        if (driver != null) {
            driver.quit();
            extentTest.log(Status.INFO, "Finalizado de teste");
            Report.closeReport();
        }
    }

}