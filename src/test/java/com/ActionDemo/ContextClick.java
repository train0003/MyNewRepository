package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ContextClick {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	  Actions act = new Actions(driver);
	  WebElement rtclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	  act.contextClick(rtclick).sendKeys(Keys.ARROW_DOWN)
	  .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  
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
