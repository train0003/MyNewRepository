package com.ActionDemo;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class FirefoxSetPreferences {
	WebDriver driver;
  @Test
  public void f() {
	  FirefoxProfile profile = new  FirefoxProfile();
	  profile.setPreference("general.useragent.override", "android");
	  
	  /*ProfilesIni firefoxp = new ProfilesIni();
	  FirefoxProfile newfp=firefoxp.getProfile("Selenium3PlusProfile");*/
	  System.setProperty("webdriver.gecko.driver", "C:\\Eclipse Training\\geckodriver.exe");
	  driver= new FirefoxDriver(profile);
	  
	  /*FirefoxProfile Profile = new  FirefoxProfile();
	  Profile.addExtension(new File("C:\\Selenium Advance\\ExtensionsFile\\seleniumIDE.xpi"));*/
	  
	 /* driver = new FirefoxDriver(Profile);*/
	  driver.get("https://www.google.com");
	  driver.manage().window().fullscreen();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
	  
	 
	  
  }

