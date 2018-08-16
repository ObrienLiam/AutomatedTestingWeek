package com.qa.mysecondtest.SecondTest;

//import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//Testing youtube

public class Testing {
	
	ChromeDriver driver = null;
	String url = "http://www.youtube.co.uk";

	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@After
	public void teardown()
	{
		try
		{
			Thread.sleep(20000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	@Test
	public void test() {
		WebElement srchBar = driver.findElement(By.name("search_query"));
		
		srchBar.sendKeys(Keys.SHIFT, "dayman");
		srchBar.sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("Dayman")).click();
		
		
		//vidBut.click();
		
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
