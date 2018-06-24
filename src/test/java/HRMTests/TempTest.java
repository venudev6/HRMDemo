package HRMTests;

import org.apache.commons.io.FileUtils;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class TempTest {

    WebDriver driver;


    @Test
    public void sample1() {

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
                "/src/test/resources/linux/geckodriver-v0.17.0-linux64/geckodriver");

        WebDriver driver = new FirefoxDriver();
        Point point = new Point(0,0);



        driver.quit();



    }

    @Test
    public void Sample2() {
        System.out.println("This is a sample test 2");
    }


}
