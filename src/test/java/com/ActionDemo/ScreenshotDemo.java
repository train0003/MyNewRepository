package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.internal.Utils;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScreenshotDemo {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://docs.seleniumhq.org");
	  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Utils.copyFile(srcFile,new File("C:\\temp\\screenshot.png"));
	  
  }
  @BeforeTest
  public void beforeTest() {

	  System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Training\\SeleniumLatest\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().fullscreen();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
