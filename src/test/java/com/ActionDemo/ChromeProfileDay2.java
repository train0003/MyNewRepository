package com.ActionDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProfileDay2 {
	WebDriver driver;
  @Test
  public void f() {
	  ChromeOptions chrome = new ChromeOptions();
	  chrome.addExtensions(new File("C:\\Selenium Advance\\ExtensionsFile\\KatalonChrome.crx"));  
	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Training\\SeleniumLatest\\chromedriver.exe");
	  driver = new ChromeDriver(chrome);
	  driver.manage().window().fullscreen();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
  }
  }

