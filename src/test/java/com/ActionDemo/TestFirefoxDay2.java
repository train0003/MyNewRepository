package com.ActionDemo;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestFirefoxDay2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Eclipse Training\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().fullscreen();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(10000);
  }

}
