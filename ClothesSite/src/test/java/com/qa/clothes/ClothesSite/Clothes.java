package com.qa.clothes.ClothesSite;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class Clothes {

	ChromeDriver driver = null;
	String url = "http://automationpractice.com/index.php";

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
		driver.quit();
	}
	
	@Test
	public void testClothes()
	{
		ClothesHomePOM page = PageFactory.initElements(driver, ClothesHomePOM.class);
		page.searchFor("dress");
		String name = "\"DRESS\"";
		assertEquals(name, driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[1]")).getText());
	}
}
