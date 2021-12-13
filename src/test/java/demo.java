import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class demo {


    public static void main(String args[]) throws IOException {
        AndroidDriver<MobileElement> driver;
        IOSDriver driver1;

        //------------------ Android -------------
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName","3201cff54d0e661b");
        capabilities.setCapability("platformName","Android");
        //Here passe a public IP's of Selenium HUB
        driver  = new AndroidDriver<MobileElement>(new URL("http://20.204.77.152:4444/"), capabilities);

//        // ---------  iOS -------------
        DesiredCapabilities capabilities1 = new DesiredCapabilities();
        capabilities1.setCapability("platformVersion", "13.2.2");
        capabilities1.setCapability("deviceName","iPhone");
        capabilities1.setCapability("platformName","iOS");
        capabilities1.setCapability("udid","e3a2211901a618a832d92b5cecec27ca049f0a0d");
        capabilities1.setCapability("autoAcceptAlerts","true");
//
        driver1 = new IOSDriver<MobileElement>(new URL("http://20.204.77.152:4444/"), capabilities1);
        System.out.println(driver.getPageSource());
        System.out.println(driver1.getPageSource());
        screenshot("",driver);
        screenshot1("",driver1);

        driver.quit();
        driver1.quit();

    }
    public static void screenshot(String path_screenshot, AndroidDriver driver) throws IOException {
        File srcFile= driver.getScreenshotAs(OutputType.FILE);
        String filename= UUID.randomUUID().toString();
        File targetFile=new File(path_screenshot + "Android" +".jpg");
        FileUtils.copyFile(srcFile,targetFile);
    }
    public static void screenshot1(String path_screenshot, IOSDriver driver) throws IOException {
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        String filename= UUID.randomUUID().toString();
        File targetFile=new File(path_screenshot + "IOS" +".jpg");
        FileUtils.copyFile(srcFile,targetFile);
    }


}
