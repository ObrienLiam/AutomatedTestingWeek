package com.qa.tea.PassionateTea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constants {

	public static String URL="http://www.practiceselenium.com/welcome.html";
	
	public static String REPORT_PATH = "C:\\Users\\Admin\\Desktop\\Reports\\TeaTest.html";
	
	public static WebDriver setDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
}
