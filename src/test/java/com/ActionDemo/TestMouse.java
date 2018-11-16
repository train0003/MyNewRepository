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

public class TestMouse {
	WebDriver driver;
	
  @Test(enabled = true)
  public void Login() {
	  driver.get("https://www.homeshop18.com/");
	  WebElement pop = driver.findElement(By.xpath("//a[@title ='Close']"));
	  pop.click();
	  WebElement pop2 = driver.findElement(By.xpath("//a[text() = 'Later']"));
	  pop2.click();
	  Actions act = new Actions(driver);
	  WebElement digital = driver.findElement(By.xpath("//a[text()='Digital']"));
	  act.moveToElement(digital).perform();
	  
  
  }
  @Test(enabled = false)
  public void ThirdTestCase() {
	  driver.get("https://www.google.com/");
	  Actions act = new Actions(driver);
	  WebElement guj = driver.findElement(By.xpath("//a[text()='ગુજરાતી']"));
	  act.keyDown(Keys.CONTROL).click(guj).build().perform();
	  
  
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
	  driver.close();
	  
  }

}
