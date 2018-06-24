package zpdf.basicTests;

import HRMTests.Factory;
import config.MainLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import zpdf.basicTests.PDFPDF.PDFDocPage;
import zpdf.basicTests.PDFPDF.PDFPDFHomePage;


/**
 * Created by sivar on 12-06-2017.
 */
public class ExtractPDFDataTest extends Factory {

    PDFPDFHomePage pdfpdfHomePage;
    PDFDocPage pdfDocPage;
    String url=null;
    String pdfData;

    public ExtractPDFDataTest(){
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


    @Test(priority=0)
    public void navigateToHomePageTest(){
        pdfpdfHomePage = new PDFPDFHomePage(driver);
        log.info("Successfully navigated to Home Page.");
    }

    @Test(priority=1 )
    public void checkPDFPageTest(){
        pdfDocPage = pdfpdfHomePage.clickOnPDFLink();
        pdfDocPage.shiftToNewTab();
        this.url=pdfDocPage.getCurrentURL();
        log.info("The current URL is : "+url);
        if(url.endsWith(".pdf"))        {
            log.info("Successfully navigated to pdf file page.");
        }else
            log.error("Unable to navigate to URL",new Exception());
    }

    @Test(priority =2)
    public void extractPDFTextDataTest(){
       pdfData =  pdfDocPage.extractDataFromPDF(this.url);
       log.info("The PDF Data is : \n\n\n"+pdfData);
        System.out.println("\n\n\n");
    }


    @AfterClass
    public void tearDown(){
        System.out.println("----------------------------------------------------------------------------------------");
        log.info("Ended class " + getClass().toString());
        System.out.println("----------------------------------------------------------------------------------------");
    }

}
