package com.appium.mobile.mobilegestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchDefaultAndroidBrowser {
	
	@Test
	public void testLaunchBrowser()throws Exception {
	
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Moto G (3rd generation)");
		capabilities.setCapability("appPackage", "com.google.android.chrome");
		capabilities.setCapability("appActivity", "Main");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);	
        driver.get("http://kroger.com");
        System.out.println(driver.getPageSource());
       // driver.findElement(By.id("signIn")).click();
       // driver.findElements(By.id("signin-drawer-email-address")).sendKeys("mobile.automation7@gmail.com");
        //driver.findElements(By.id("signin-drawer-email-address")).sendKeys("training12");
        //driver.findElements(By.id("signin-drawer-submit")).click();
		//Get the user agent from device
		//JavascriptExecutor je=(JavascriptExecutor)drier;
		//System.out.println(je.executeScript("return navigator.useragent;", new Object[0]));
		Thread.sleep(10000);
		driver.quit();
	}

}
