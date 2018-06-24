package pages.HRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;


public class logOutPage extends BasePage {

    @FindBy(id="txtUsername") WebElement userName;
    WebDriver driver=null;


    public logOutPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,AJAXPAGETIMEOUT),this);
        uiUtility.safeWaitForElementVisibility(PAGETIMEOUT,userName);
    }



}
