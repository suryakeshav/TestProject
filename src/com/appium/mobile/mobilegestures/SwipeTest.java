package com.appium.mobile.mobilegestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SwipeTest {

	@Test
	
	public void testSwipe() throws MalformedURLException, InterruptedException{
	
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Moto G (3rd generation)");
		capabilities.setCapability("app", "C:\\Users\\Surya\\Downloads\\com.mobeta.android.demodslv_0.5.0.apk");
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "Launcher");
	    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);	
		
		
		List<WebElement> li1=driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title"));
		li1.get(2).click();
		
		//creating constructor with help of TouchAction Java Doc      
	    new TouchAction((MobileDriver)driver).longPress((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(1)).moveTo(91, 572).release().perform();	
        Thread.sleep(5000);
        driver.quit();
	 
	    //List<WebElement> li2 = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		//li2.get(1).click();
		
		
	
	}	
	
}
