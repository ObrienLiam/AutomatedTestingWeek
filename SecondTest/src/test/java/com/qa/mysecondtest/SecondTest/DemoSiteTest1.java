package com.qa.mysecondtest.SecondTest;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest1 {

	ChromeDriver driver = null;
	String url = "http://thedemosite.co.uk";

	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void Test1()
	{
		driver.findElement(By.linkText("3. Add a User")).click();
		WebElement addUser = driver.findElement(By.name("username"));
		WebElement addPass = driver.findElement(By.name("password"));
		
		addUser.sendKeys("user");
		addPass.sendKeys("Pass");
		
		driver.findElement(By.name("FormsButton2")).click();
		
		driver.findElement(By.linkText("4. Login")).click();
		WebElement logUser = driver.findElement(By.name("username"));
		WebElement logPass = driver.findElement(By.name("password"));
		
		logUser.sendKeys("user");
		logPass.sendKeys("Pass");
		
		driver.findElement(By.name("FormsButton2")).click();

		assertEquals("**Successful Login**", driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());

	}
	
	@After
	public void teardown()
	{
		try
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
}
