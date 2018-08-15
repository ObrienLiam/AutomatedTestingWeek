package com.qa.pairprog.PairProgramming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constants {
	
	public static String URL = "http://newtours.demoaut.com/mercurywelcome.php";
	
	public static String Path = "C:\\Users\\Admin\\Desktop\\DDT\\Pair.xlsx";
	
	public static String Rep_Path = "C:\\Users\\Admin\\Desktop\\Reports\\Pair.html";

	public static WebDriver initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
}
