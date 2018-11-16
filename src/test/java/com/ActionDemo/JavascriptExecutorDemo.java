package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JavascriptExecutorDemo {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium hq",Keys.ENTER);
	  
	 // WebElement element = driver.findElement(By.id("gsr"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("window.scrollBy(0,400);");
	 // executor.executeScript("arguments[0].click;", element);
	  
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
