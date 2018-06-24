package utilities;

import config.MainLogger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShotUtility {

    MainLogger log = new MainLogger(this.getClass().getName());
    File screenshot = null;

    public void takeScreenShot(WebDriver driver , String fileLocation){

        try {
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(fileLocation));
        }catch(Exception e){

            log.error("Error generated , please find the error messaage below : /n",e);
        }


    }
}
