package com.appium.mobile.mobilegestures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouchTest {

@Test
	
	public void testMultiTouch() throws MalformedURLException {
	
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Moto G (3rd generation)");
		capabilities.setCapability("app", "C:\\Users\\Surya\\Downloads\\MultiTouch_Test.com.apk");
		capabilities.setCapability("appPackage", "com.easylabs.multitouch");
		capabilities.setCapability("appActivity", "MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);	
		
		TouchAction action1=new TouchAction((MobileDriver)driver).longPress(114,363).waitAction(100).release().perform();
		TouchAction action2=new TouchAction((MobileDriver)driver).longPress(839,1450).release().waitAction().perform();
		new MultiTouchAction((MobileDriver)driver).add(action1).add(action2).perform();
				
		
	
}
	
		
	
}
