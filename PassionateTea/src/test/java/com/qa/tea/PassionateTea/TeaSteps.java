package com.qa.tea.PassionateTea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class TeaSteps {
	
	WebDriver driver;
	
	public static ExtentReports report;
	public ExtentTest test;
	
	public static int i = 0;
	
//	static()
//	{
//		report = new ExtentReports(Constants.REPORT_PATH,true);
//		report.flush();
//	}
	
	@Before
	public void setUp()
	{
		//report = new ExtentReports(Constants.REPORT_PATH,false);
		i++;
		
		if (i == 1)
		{
			report = new ExtentReports(Constants.REPORT_PATH,true);
		}
	}
	
	@After
	public void tearDown()
	{
		//report.flush();
		driver.quit();
		
		if (i == 2)
		{
			report.flush();
		}
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address()  {
		
	    driver = Constants.setDriver();
	    driver.get(Constants.URL);

	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page()  {

		test = report.startTest("Verify menu navigation");
		test.log(LogStatus.INFO, "Browser started");
		
		MainPOM home = PageFactory.initElements(driver, MainPOM.class);
		home.menuNav();
		
		test.log(LogStatus.INFO, "Browser started");
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products()  {
		
		String green = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")).getText();
		
		System.out.println(green);
		
		if (green.equals("Green Tea") )
		{
			test.log(LogStatus.PASS, "Contents displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Contents not displayed");
		}
		
		assertEquals(green, "Green Tea");
		
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {

		test = report.startTest("Verify Checkout navigation");
		test.log(LogStatus.INFO, "Browser started");
		
		MainPOM home = PageFactory.initElements(driver, MainPOM.class);
		home.menuNav();
		
		MenuPOM menu = PageFactory.initElements(driver, MenuPOM.class);
		menu.chOut();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page()  {
	   
		String proceed = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).getText();
		
		System.out.println(proceed);
		
		if (proceed.equals("Place Order"))
		{
			test.log(LogStatus.PASS, "Check out page displayed");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Check out page not displayed");
		}
		
		assertEquals(proceed,"Place Order");
	}
}
