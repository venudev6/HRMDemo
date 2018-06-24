package config.listeners;

import HRMTests.BaseFactory;
import HRMTests.Factory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pages.BasePage;
import utilities.DateAndTimeUtility;
import utilities.UIUtility;

public class TestListener extends Factory implements ITestListener {


    UIUtility uiUtility=null;
    DateAndTimeUtility dateAndTimeUtility = null;
    String timeStamp;
    final String SYSTEMSEP = System.getProperty("file.separator");
    private String loc = "screenShots"+SYSTEMSEP;

    public TestListener(){
        super();
        this.dateAndTimeUtility = new DateAndTimeUtility();
        timeStamp = this.dateAndTimeUtility.getCurrentDateAndTime();
    }

    /**
     * Runs each time a test method is run.
     * @param result
     */
    public void onTestStart(ITestResult result){
        System.out.println("******************************************************************");
        System.out.println("------>Test Method: "+result.getMethod().getMethodName()+", has started.");
        System.out.println("Test Method Start Time : "
                + dateAndTimeUtility.getCurrentDateAndTime(result.getStartMillis()));
    }


    /**
     * Invoked each time a test succeeds.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS
     */
    public void onTestSuccess(ITestResult result){
        System.out.println("Test Method: "+result.getMethod().getMethodName() +",has passed successfully.");
        System.out.println("Test Method End  Time : "
                + dateAndTimeUtility.getCurrentDateAndTime(result.getEndMillis()));
        System.out.println("Total Time taken to run the test method is : "
                + (result.getEndMillis()-result.getStartMillis())/1000+",seconds");
        System.out.println("******************************************************************");
    }

    /**
     * Invoked each time a test fails.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#FAILURE
     */
    public void onTestFailure(ITestResult result){
        System.out.println("Test Method: "+result.getMethod().getMethodName() +",has FAILED ");
        System.out.println("Test Method Fail Time : "
                + dateAndTimeUtility.getCurrentDateAndTime(result.getEndMillis()));
        System.out.println("Total Time taken to run the test method is : "
                + (result.getEndMillis()-result.getStartMillis())/1000+",seconds");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    /**
     * Invoked each time a test is skipped.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SKIP
     */
    public void onTestSkipped(ITestResult result){
        System.out.println("Test : "+result.getMethod().getMethodName() +"has skipped ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    /**
     * Invoked each time a method fails but has been annotated with
     * successPercentage and this failure still keeps it within the
     * success percentage requested.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
     */
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){}

    /**
     * Invoked after the test class is instantiated and before
     * any configuration method is called.
     */
    public void onStart(ITestContext context){
        System.out.println("******************************************************************");
        System.out.println("Starting the Testng Test : "+context.getName());

    }

    /**
     * Invoked after all the tests have run and all their
     * Configuration methods have been called.
     */
    public void onFinish(ITestContext context){
        System.out.println("Completed  the Testng Test : "+context.getName());

        System.out.println("******************************************************************");
    }
}
