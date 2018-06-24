package zpdf.basicTests;

import config.MainLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import HRMTests.Factory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sivar on 12-06-2017.
 */
public class FirstClass extends Factory {

    public FirstClass(){
        super();
        log = new MainLogger(this.getClass().getName());
    }

    @BeforeClass
    public void startClass(){
        System.out.println("----------------------------------------");
        log.info("Starting class " + getClass().toString());
        System.out.println("----------------------------------------");
    }


    @Test
    public void check(){
        log.info("This is a sample test"+ System.getProperty("user.dir"));
        driver.get(baseURL);

    }

    @Test
    public void simpleTestTrue() throws Exception {
        //assertLogger.AssertTrue("This is a successfull test");
    }

    //@Test
    public void simpleTestFail() throws Exception {
        //assertLogger.AssertFalse("This is a Failure test");
    }

    @AfterClass
    public void endClass(){
        System.out.println("----------------------------------------");
        log.info("Ended class " + getClass().toString());
        System.out.println("----------------------------------------");
    }

}
