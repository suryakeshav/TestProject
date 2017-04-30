package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchAppOnEmulator {

public static void main(String [] args) throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("app", "C:\\Users\\Surya\\Downloads\\selendroid-test-app-0.17.0.apk");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	
	}
	

}
