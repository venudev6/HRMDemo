package HRMTests;

import config.MainLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HRMPages.DashBoardPage;
import pages.HRMPages.DemoOrangeHRMLoginPage;

public class LoginHRMTests extends Factory {

    String userNameValue = "admin";
    String userPasswordValue = "admin";
    DemoOrangeHRMLoginPage demoOrangeHRMLoginPage;
    DashBoardPage dashBoardPage;

    public LoginHRMTests(){
        super();
        log = new MainLogger(this.getClass().getName());
    }

    @BeforeClass
    public void setUp(){
        /*System.out.println("----------------------------------------------------------------------------------------");
        log.info("Starting class " + getClass().toString());
        System.out.println("----------------------------------------------------------------------------------------");*/
        driver.get(baseURL);
        log.info("Navigated to login Page.");
    }

    @Test(priority=001)
    public void loginIntoHRM(){
        demoOrangeHRMLoginPage = new DemoOrangeHRMLoginPage(driver);
        demoOrangeHRMLoginPage.enterUserName(userNameValue);
        demoOrangeHRMLoginPage.sendUserPassword(userPasswordValue);
        log.info("Driver in tests page : "+getDriver().toString());
        dashBoardPage=demoOrangeHRMLoginPage.clickLoginbutton();
    }

    @Test(priority=002)
    public void loginIntoHRM2(){

        log.info("IN loginIntoHRM2");
        //dashBoardPage=demoOrangeHRMLoginPage.clickLoginbutton();
    }


    @AfterClass
    public void tearDown(){
        /*System.out.println("----------------------------------------------------------------------------------------");
        log.info("Ended class " + getClass().toString());
        System.out.println("----------------------------------------------------------------------------------------");*/
    }
}
