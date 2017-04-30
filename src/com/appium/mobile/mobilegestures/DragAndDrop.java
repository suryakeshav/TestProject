
package com.appium.mobile.mobilegestures;

import java.net.MalformedURLException;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DragAndDrop {
	
	
	@Test
	
	public void testDragDrop() throws Exception{
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
		
		List<WebElement> li3=driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title"));
		li3.get(0).click();
		//creating constructor with help of TouchAction Java Doc
		new TouchAction ((MobileDriver)driver).longPress((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0)).moveTo((WebElement) driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(7)).release().perform();
					
		
		List<WebElement> li4=driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		li4.get(0).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
