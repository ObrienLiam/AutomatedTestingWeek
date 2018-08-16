package com.qa.demo.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constants {

	public static final String URL = "http://demoqa.com/";
	
	public static final String Report_Path = "C:\\Users\\Admin\\Desktop\\Reports\\DemoQA.html";
	
	public static final String Data_Path = "C:\\Users\\Admin\\Desktop\\DDT\\DemoQA.xlsx";
		
	public static WebDriver initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
	
}
