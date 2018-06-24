package zpdf.basicTests.PDFPDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;

public class PDFPDFHomePage extends BasePage {

    WebDriver driver = null;
    PDFDocPage pdfDocPage;

    @FindBy(xpath = "//a[@href='samples/xlsdemo1.pdf']")
    private WebElement pdfLink;

    public PDFPDFHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        uiUtility.safeWaitForElementVisibility(PAGETIMEOUT, pdfLink);
    }

    public PDFDocPage clickOnPDFLink() {
        uiUtility.safeClick(pdfLink);
        return new PDFDocPage(driver);
    }

}
