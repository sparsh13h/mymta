package alluretest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import java.net.URL;
 
public class SauceLabTest {
	
	public static AppiumDriver wd;
 
  public static final String USERNAME = "sparsh13h";
  public static final String ACCESS_KEY = "6e5cc07d-9cc7-4f83-b497-42449247bc45";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
 
    public static void main(String[] args) throws Exception {
 
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("app", "https://s3.amazonaws.com/appium/TestApp8.4.app.zip");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        //capabilities.setCapability("appiumVersion", "1.5.3");
        System.out.println(URL);
 
        wd = new IOSDriver(new URL(URL), capabilities);
 
        /**
         * Test Actions here...
         */
 
        //driver.quit();
    }
}