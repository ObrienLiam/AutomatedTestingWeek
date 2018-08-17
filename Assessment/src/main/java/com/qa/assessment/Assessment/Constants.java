package com.qa.assessment.Assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constants {
	public static final String URL = "https://qa-trials641.orangehrmlive.com/auth/login";
	
	public static final String REPORT_PATH = "C:\\Users\\Admin\\Desktop\\Reports\\";
	
	public static final String REPORT_NAME = "AssessmentTest.html";
	
	public static final String DRIVER_PATH = "C:\\\\Development\\\\chromedriver_win32/chromedriver.exe";
	
	public static WebDriver setDriver()
	{
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
}
