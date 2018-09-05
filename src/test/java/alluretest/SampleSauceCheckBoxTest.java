package alluretest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;

public class SampleSauceCheckBoxTest {

  public static final String USERNAME = "sparsh13h";
  public static final String ACCESS_KEY = "6e5cc07d-9cc7-4f83-b497-42449247bc45";
  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
  
 
  public static void main(String[] args) throws Exception {

	  DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
	    capabilities.setCapability("platformVersion", "4.4");
	    //capabilities.setCapability("testobject_api_key", "ECA0147DA37D43E6B368F606D8C41D3F");
	    capabilities.setCapability("app", "https://github.com/saucelabs-sample-test-frameworks/GuineaPig-Sample-App/blob/master/android/GuineaPigApp-debug.apk?raw=true");
	    capabilities.setCapability("browserName", "");
	    capabilities.setCapability("deviceOrientation", "portrait");
	   // capabilities.setCapability("appiumVersion", "1.5.3");

	  //  WebDriver driver = new AndroidDriver<MobileDriver>(new URL(URL), capabilities);

    System.out.println(URL);
    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);

    /**
     * Test Actions here...
     */

  // driver.quit();	
  }
}