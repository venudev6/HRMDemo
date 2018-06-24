package pages.HRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;

public class DemoOrangeHRMLoginPage extends BasePage {


    @FindBy(id="txtUsername")   private WebElement userName;
    @FindBy(id="txtPassword")   private WebElement userPassword;
    @FindBy(id="btnLogin")      private WebElement loginButton;


    WebDriver driver = null;

    public DemoOrangeHRMLoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,AJAXPAGETIMEOUT),this);
        uiUtility.safeWaitForElementVisibility(PAGETIMEOUT,userName);
    }

    public void enterUserName(String userNameValue){
        uiUtility.safeSendKeys(userName,userNameValue);
    }

    public void sendUserPassword(String userPasswordValue){

        uiUtility.safeSendKeys(userPassword,userPasswordValue);
    }

    public DashBoardPage clickLoginbutton(){
        uiUtility.safeClick(loginButton);
        return new DashBoardPage(this.driver);
    }



}
