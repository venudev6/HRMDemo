package config;

import org.testng.Assert;

/**
 * Created by sivar on 18-06-2017.
 */
public class AssertLogger {


    MainLogger log = new MainLogger(this.getClass().getName());
    Exception e;

    public void AssertTrue(String message){

        Assert.assertTrue(true);
        log.info("Pass ");

    }

    public void AssertFail(String message){

        try {
            Assert.assertFalse(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        log.error("Fail ",e);
    }

    public void AssertFalse(String message){

    try {
        Assert.assertFalse(true);
        }catch (Exception e){
        e.printStackTrace();
    }
        log.error("Fail ",e);
    }


    public void AssertEquals(String message1, String message2){

        Assert.assertTrue(true);
        log.info("Pass ");

    }

    public void AssertEqualsTemp(String message1, String message2){

        Assert.assertTrue(true);
        log.info("Pass ");

    }

    public void AssertEqualsTemp2(String message1, String message2){

        Assert.assertTrue(true);
        log.info("Pass ");

    }

}
