package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FramesDemo {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://jqueryui.com/dialog");
   //   driver.switchTo().frame(0);
	 // WebElement close = driver.findElement(By.xpath("//*[@title = 'Close']"));
	  //second approach
	  WebElement close = driver.findElement(By.xpath("//*[@class='demo-frame']"));
	  driver.switchTo().frame(close);
	  WebElement inner =driver.findElement(By.xpath("//*[@title = 'Close']"));
	  inner.click();
      
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
