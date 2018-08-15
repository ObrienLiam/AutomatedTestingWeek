package com.qa.pairprog.PairProgramming;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.TestCase;

public class MainTest  {
	
	static WebDriver driver = null;
	
	static ExtentReports report;
	public ExtentTest test;
	
	@BeforeClass
	public static void startup()
	{
		report = new ExtentReports(Constants.Rep_Path,true);
	}

	@Before
	public void setup()
	{
		driver = Constants.initialize();
		driver.get(Constants.URL);
	}
	
	@After
	public void closeDown()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		report.endTest(test);
		driver.quit();
	}
	
	@AfterClass
	public static void shutdown()
	{
		report.flush();
	}
	
	
	
	@Test
	//@Ignore
	public void registerTest()
	{
		
		test = report.startTest("Registering user");
		test.log(LogStatus.INFO, "Browser started");
		
		String testData;
		
		String compare = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		
		homePage home = PageFactory.initElements(driver, homePage.class);
		home.register();
		
		RegisterPage reg = PageFactory.initElements(driver, RegisterPage.class);
		
		ExcelInit2.setExcelFile(Constants.Path,0);
		
		for (int i=1; i<ExcelInit2.ExcelWSheet.getPhysicalNumberOfRows();i++)
		{
			test.log(LogStatus.INFO, "Registering user "+i);
			
			reg.addUser(driver, i);
			
			testData = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
			
			if (testData.equals(compare))
			{
				test.log(LogStatus.PASS,"Register successful");
			}
			else
			{
				test.log(LogStatus.FAIL,"Register failed");
			}
			
			assertEquals(testData,compare);
			
			driver.get(Constants.URL);
			home.register();
		}
	}
	
	@Test
	public void loginTest()
	{
		test = report.startTest("Logging in user");
		test.log(LogStatus.INFO, "Browser started");
		
		homePage login = PageFactory.initElements(driver, homePage.class);
	
		String welcomeBack = "Welcome back to Mercury Tours!";
		String check;	
		
		ExcelInit2.setExcelFile(Constants.Path,0);

		for(int i =1; i<ExcelInit2.ExcelWSheet.getPhysicalNumberOfRows(); i++)
		{
			test.log(LogStatus.INFO, "Logging in user "+i);
			
			login.logIn(driver, i);
			
			check = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText();
			
			if(check.equals(welcomeBack))
			{
				test.log(LogStatus.PASS, "Login Successful");
			} 
			else {
				test.log(LogStatus.FAIL, "Login Unsuccessful");
			}
			assertEquals(check, welcomeBack);
			
			driver.get(Constants.URL);
		}
		
		
	}
}

