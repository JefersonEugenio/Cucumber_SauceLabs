package framework.supports;

import framework.webDrivers.DriverFactory;
import framework.webDrivers.DriverManager;
import framework.webDrivers.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import static framework.webDrivers.DriverManager.getDriver;

public class BaseTest extends DriverFactory {

    @BeforeAll
    public static void setUpAll() {
        System.out.println("setUpAll");
        DriverManager.setDriver(getBrowser(Drivers.CHROME));
        DriverManager.getDriver();
        if (getDriver() == null) {
            throw new IllegalStateException("Driver não foi inicializado corretamente!");
        }
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        DriverManager.getDriver().get("https://www.saucedemo.com/v1/index.html");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("tearDownAll");
        DriverManager.quit();
    }
}
