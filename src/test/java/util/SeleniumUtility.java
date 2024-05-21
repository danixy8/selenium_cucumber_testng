package util;

import drivers.WebDrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SeleniumUtility {

    public WebDriver driver = null;

    WebDrivers webDrivers;

    public SeleniumUtility() {
        webDrivers = new WebDrivers();

        driver = webDrivers.createAndGetDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

}
