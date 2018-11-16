package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragDropDemo {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  Actions act = new Actions(driver);
	  WebElement draggable = driver.findElement(By.xpath("//div[@id = 'draggable']"));
      WebElement droppable = driver.findElement(By.xpath("//div[@id = 'droppable']"));
      act.dragAndDrop(draggable, droppable).build().perform();
      System.out.println("drag and drop success");
      
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
