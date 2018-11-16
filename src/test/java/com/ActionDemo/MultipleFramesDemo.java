package com.ActionDemo;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MultipleFramesDemo {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	  int size = driver.findElements(By.tagName("iframe")).size();
	  System.out.println("Total frames in page- "+size);
	  driver.switchTo().frame(0);
	  
	 int size1=  driver.findElements(By.tagName("iframe")).size();
	  System.out.println("Total frames in frame A"+size1);
	  driver.switchTo().frame(0);
	  System.out.println(driver.findElement(By.xpath("html/body/h1")).getText());
	  
	  
	  
	  
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
