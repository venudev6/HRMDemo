package HRMTests;

import config.MainLogger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DashBoardPageTests extends Factory {

    String userNameValue = "admin";
    String userPasswordValue = "admin";

    public DashBoardPageTests(){
        super();
        log = new MainLogger(this.getClass().getName());
    }

    @BeforeClass
    public void setUp(){
        System.out.println("----------------------------------------------------------------------------------------");
        log.info("Starting class " + getClass().toString());
        System.out.println("----------------------------------------------------------------------------------------");
        driver.get(baseURL);
    }

    @Test
    public void checkElementUnavialable(){

    }

}
