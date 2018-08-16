package com.qa.demo.DemoQA;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.*;

public class DemoQATest  {

	public static ExtentReports report;
	public ExtentTest test;
			
	WebDriver driver = null;

	@BeforeClass
	public static void startup()
	{
		report = new ExtentReports(Constants.Report_Path,true);
	}
	
	@Before
	public void setup()
	{
		driver = Constants.initialize();
		driver.get(Constants.URL);
	}
	
	@After
	public void teardown()
	{		
		try
		{
			Thread.sleep(5000);
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
	@Ignore
	public void droppable()
	{
		test = report.startTest("Verify drag and drop");
		test.log(LogStatus.INFO, "Browser started");
		
		DemoQAHomePOM home = PageFactory.initElements(driver, DemoQAHomePOM.class);
		home.clickDrop();
		
		DemoQADropPOM drop = PageFactory.initElements(driver, DemoQADropPOM.class);
		drop.moveObject(driver);
		
		String testString = driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p")).getText();
		
		if (testString.equals("Dropped!"))
		{
			test.log(LogStatus.PASS,"Drag and drop successful");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Drag and drop not successful");
		}
		
		assertEquals("Dropped!", testString);
	}
	
	@Test
	@Ignore
	public void selectable()
	{		
		test = report.startTest("Verify selecting");
		test.log(LogStatus.INFO, "Browser started");
		
		DemoQAHomePOM home = PageFactory.initElements(driver, DemoQAHomePOM.class);
		home.clickSelect();
		DemoQASelectPOM select = PageFactory.initElements(driver, DemoQASelectPOM.class);
		select.butSelect(driver);
		
		String testString1 = driver.findElement(By.xpath("//*[@id=\"selectable_grid\"]/li[1]")).getAttribute("class");
		String testString2 = driver.findElement(By.xpath("//*[@id=\"selectable_grid\"]/li[2]")).getAttribute("class");
		String testString3 = driver.findElement(By.xpath("//*[@id=\"selectable_grid\"]/li[3]")).getAttribute("class");
		
		if (!testString1.contains("ui-selected") && testString2.contains("ui-selected") && testString3.contains("ui-selected"))
		{
			test.log(LogStatus.PASS,"Select successful");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Select not successful");
		}
		
		assertThat(testString1, not(containsString("ui-selected")));
		assertThat(testString2, containsString("ui-selected"));
		assertThat(testString3, containsString("ui-selected"));
	}
	
	@Test
	@Ignore
	public void accordion()
	{
		test = report.startTest("Verify selecting");
		test.log(LogStatus.INFO, "Browser started");
		
		DemoQAHomePOM home = PageFactory.initElements(driver, DemoQAHomePOM.class);
		home.clickAccord();
		
		DemoQAAssertPOM accord = PageFactory.initElements(driver, DemoQAAssertPOM.class);
		accord.headerClick();
		
		String testString1 = driver.findElement(By.id("ui-id-4")).getAttribute("aria-selected");
		String testString2 = driver.findElement(By.id("ui-id-6")).getAttribute("aria-selected");
		
		boolean tester;
		
		if (testString1.equals("false") && testString2.equals("true"))
		{
			test.log(LogStatus.PASS,"Select successful");
			tester=true;
		}
		else 
		{
			test.log(LogStatus.FAIL, "Select not successful");
			tester=false;
		}
		
		assertTrue(tester);
	}
	
	@Test
	public void registration()
	{
		String testString; 
		
		test = report.startTest("Verify registration");
		test.log(LogStatus.INFO, "Browser started");
		
		DemoQAHomePOM home = PageFactory.initElements(driver, DemoQAHomePOM.class);
		DemoQARegPOM reg = PageFactory.initElements(driver, DemoQARegPOM.class);
		
		test.log(LogStatus.INFO, "Registration opened");
		
		XSSFWorkbook workbook = null;
		try
		{
			FileInputStream file = new FileInputStream(Constants.Data_Path);
			workbook = new XSSFWorkbook(file);
			
		}
		catch(Exception x) {}
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		test.log(LogStatus.INFO, "DDT file read");

		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++)
		{
			driver.get(Constants.URL);
			home.clickReg();
			
			reg.sendReg(sheet, i);
			
			test.log(LogStatus.INFO, "Adding user "+i);
			
			testString = driver.findElement(By.xpath("//*[@id=\"post-49\"]/div/p")).getText();
			
			System.out.println(testString);
			
			if (testString.equals("Thank you for your registration"))
			{
				test.log(LogStatus.PASS,"User "+i+" registration successful");
			}
			else
			{
				test.log(LogStatus.FAIL,"User "+i+" registration failed");
			}
			
			assertEquals("Thank you for your registration",testString);
		}
	}
	
}
