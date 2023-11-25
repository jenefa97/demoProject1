package com.AutomationTalks.demoproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void lauchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64");
		driver = new ChromeDriver();
		
//	    driver.manage().timeouts().implicitlyWait(10, TimeUnit )
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1() {
    	driver.navigate().to("www.AutomationTalks.com");
    	System.out.println("Test 1 title: "+ driver.getTitle());
    }
	@Test
    public void Test2() {
    	driver.navigate().to("www.AutomationTalks.com");
    	System.out.println("Test 2 title: "+ driver.getTitle());
    }
	@Test
    public void Test3() {
    	driver.navigate().to("www.AutomationTalks.com");
    	System.out.println("Test 3 title: " + driver.getTitle());
    }
    
    @AfterMethod
    public void quit() {
    	driver.quit();
    }
}

