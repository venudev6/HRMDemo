package pages;

import org.openqa.selenium.WebDriver;
import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;
import utilities.UIUtility;

public class BasePage implements IConfigurable {

    protected long pageLoadStartTime;
    protected long pageLoadEndTime;
    protected final int PAGETIMEOUT =15;
    protected final int AJAXPAGETIMEOUT=30;
    protected UIUtility uiUtility=null;
    //WebDriver driver=null;

    public BasePage(WebDriver driver){

        uiUtility = new UIUtility(driver);
    }

    public void run(IConfigureCallBack callBack, ITestResult testResult){    }

    protected void markPageLoadStartTime() {
        pageLoadStartTime = System.currentTimeMillis();
    }
    protected long markPageLoadEndTime() {
        pageLoadEndTime = System.currentTimeMillis();
        return pageLoadEndTime - pageLoadStartTime;

        //logger.debug("it took " + duration + "ms to load "+ this.getClass().toString());
    }

}
