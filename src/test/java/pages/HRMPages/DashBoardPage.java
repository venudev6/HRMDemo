package pages.HRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;

public class DashBoardPage extends BasePage {

    @FindBy(xpath=".//canvas") WebElement canvasGraph;
    @FindBy(id="welcome") WebElement userIcon;
    @FindBy(xpath="//a[@href='/index.php/auth/logout']") WebElement logOutButton;

    WebDriver driver=null;


    public DashBoardPage(WebDriver driver){

        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,AJAXPAGETIMEOUT),this);
        uiUtility.safeWaitForElementVisibility(PAGETIMEOUT,canvasGraph);
        }

    public void clickOnUserIcon(){
        uiUtility.safeClick(userIcon);
    }

    public logOutPage clickOnLogOut(){
        uiUtility.safeClick(logOutButton);
        return new logOutPage(driver);
    }


}
