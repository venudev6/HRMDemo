package zpdf.basicTests.PDFPDF;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.Set;

public class PDFDocPage extends BasePage{

    WebDriver driver = null;

    public PDFDocPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl().toString();
    }

    public void shiftToNewTab(){
        uiUtility.switchToNextTab();
    }

    public Set<String> getCurrentWindowHandles(){
        return driver.getWindowHandles();
    }

    public String extractDataFromPDF(String url){

        return uiUtility.getPDFDataInStringFromPage(url);
    }


}
