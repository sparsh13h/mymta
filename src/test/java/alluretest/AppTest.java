package alluretest;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class AppTest 
{
public static AndroidDriver<MobileElement> driver;
	
    public static void main(String[] args) throws MalformedURLException, InterruptedException{
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName","emulator");
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("noReset", true);
	
	System.out.println(System.getProperty("user.dir"));
    File classpathRoot = new File(System.getProperty("user.dir"));
    File appDir = new File(classpathRoot, "/Apps");
    File app = new File(appDir, "Mymta_0.0.18k.apk");
    capabilities.setCapability("app", app.getAbsolutePath());
    capabilities.setCapability("appPackage", "info.mta.mymta");
    capabilities.setCapability("appActivity","com.mta.android.presentation.launcher.LauncherActivity");

	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	Thread.sleep(15000);
	System.out.println("Locator= " +driver.findElement(By.className("android.widget.ImageButton")));
    driver.findElement(By.className("android.widget.ImageButton")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.support.v7.widget.LinearLayoutCompat[@index='7']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[contains(text(), 'Long Island Rail Road')]")).click();
		
	driver.findElement(By.id("info.mta.mymta:id/card_long_island_rail")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("info.mta.mymta:id/from_ll")).sendKeys("Babylon");
	driver.findElement(By.id("info.mta.mymta:id/from_ll")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("info.mta.mymta:id/to_ll")).click();
	driver.findElement(By.id("info.mta.mymta:id/to_ll")).sendKeys("Albertson");
	Thread.sleep(5000);
	driver.findElement(By.id("info.mta.mymta:id/buttonFindSchedules")).click();
	
	
    }	
	
}