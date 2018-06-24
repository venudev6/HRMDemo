package utilities;

import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeUtility {

    public DateAndTimeUtility() {

    }

    public String getCurrentDate() {

        return (new SimpleDateFormat("dd MMM yyyy").format(new Date()));
    }

    public String getCurrentDateAndTime() {

        return (new SimpleDateFormat("dd MMM yyyy HH:mm:ss z").format(new Date()));
    }

    public String getCurrentDateAndTime(Long timeInMillis){
        return (new SimpleDateFormat("dd MMM yyyy HH:mm:ss z").format(new Date(timeInMillis)));
    }


}
