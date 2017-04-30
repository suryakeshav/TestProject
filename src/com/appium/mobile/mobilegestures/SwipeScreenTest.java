package com.appium.mobile.mobilegestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class SwipeScreenTest {
	
	
	@Test
	public void testSwipeScreen() throws Exception{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Moto G (3rd generation)");
		capabilities.setCapability("appPackage", "com.android.calendar");
		capabilities.setCapability("appActivity", "LaunchActivity");
	    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);	
		Thread.sleep(5000);
		
		
		driver.swipe(588, 690, 366, 536, 2);
		
		
	}

}
