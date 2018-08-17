package com.qa.assessment.Assessment;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class AssessSteps {
	
	WebDriver driver;	
	
	public ExtentTest test;
	public static ExtentReports report;
	
	String fname, lname, uid, user, pass;
	
	//Erasing previous report saved in location
	static {
		report = new ExtentReports(Constants.REPORT_PATH + Constants.REPORT_NAME,true);
		report.flush();
	}
	
	//Creating new report for each test, adding to new report
	@Before
	public void setUp()
	{
		report = new ExtentReports(Constants.REPORT_PATH + Constants.REPORT_NAME,false);
	}
	
	//Adding report to report file and close driver
	@After
	public void tearDown()
	{
		try
		{
			Thread.sleep(20000);
		}
		catch (Exception e) {}
		report.flush();
		driver.quit();
	}
	
	@Given("^the login page$")
	public void the_login_page()  {
		
		//Sending driver to login screen
		
	    driver = Constants.setDriver();
	    driver.get(Constants.URL);
	    
	}

	@When("^I login$")
	public void i_login()  {
	    
		//Creating test and logging status
		test = report.startTest("Verify employee search and selection for inspection");
		test.log(LogStatus.INFO, "Browser started");
		test.log(LogStatus.INFO, "Browser navigated to login screen");
		
		LoginPOM log = PageFactory.initElements(driver, LoginPOM.class);
		
		//Attempting login
		String user = "Admin";
		String password = "AdminAdmin";
		
		log.logIn(user, password);
		
		//Validating user has logged in
		try
		{
			if (driver.findElement(By.xpath("//*[@id=\"dashboard-navbar\"]/nav/div/ul[1]/li")).getText().equals("Dashboard"))
			{
				test.log(LogStatus.INFO, "User: "+user+", password: "+password+", logged in");
			}
		}
		catch(Exception e)
		{
			test.log(LogStatus.FAIL, "User: "+user+", password: "+password+", not logged in");
		}
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab()  {

		DashboardPOM dash = PageFactory.initElements(driver, DashboardPOM.class);
		
		dash.clickPIM();
		
		test.log(LogStatus.INFO, "PIM tab clicked");
		
	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab()  {

		WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.id("menu_pim_addEmployee")));
		
		DashboardPOM dash = PageFactory.initElements(driver, DashboardPOM.class);
		
		dash.clickAddEmp();
		
		test.log(LogStatus.INFO, "Employee tab clicked");
		
	}

	@When("^I fill out the Add Employee Details correctly$")
	public void i_fill_out_the_Add_Employee_Details_correctly()  {

		WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.id("firstName"))); 

		AddEmployeesPOM add = PageFactory.initElements(driver, AddEmployeesPOM.class);
		
		fname = "Bobby ";
		lname = "Boberts";
		uid = "9284";
		
		add.addEmployee(driver, fname, lname, uid);
		
		test.log(LogStatus.INFO, "Employee details filled in");
	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() {

		AddEmployeesPOM add = PageFactory.initElements(driver, AddEmployeesPOM.class);
		
		
		add.createLogin();
		
		test.log(LogStatus.INFO, "Selected 'Create Login Details'");
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly()  {

		AddEmployeesPOM add = PageFactory.initElements(driver, AddEmployeesPOM.class);
		
		user = "BobbysUser14";
		pass = "Bobs1Pass@";
		
		add.addLogin(user, pass);
		
		test.log(LogStatus.INFO, "Login details filled in");
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button()  {
	    
		AddEmployeesPOM add = PageFactory.initElements(driver, AddEmployeesPOM.class);
		
		add.clickSave();
		
		test.log(LogStatus.INFO, "Details saved");
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created()  {
		
		WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"personal_details_tab\"]/h4")));

		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		DashboardPOM dash = PageFactory.initElements(driver, DashboardPOM.class);
		
		dash.clickViewEmp();
		
		WebElement myDynamicElement2 = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"right-side\"]/header/div/nav/div/div/ul[1]/li")));
		
		EmployeeListPOM emp = PageFactory.initElements(driver, EmployeeListPOM.class);
		
		try {Thread.sleep(4000);}
		catch (Exception e) {}
		
		emp.searchBar(fname, lname);
		
		try {Thread.sleep(4000);}
		catch (Exception e) {}
		
		String temp = driver.findElement(By.xpath("//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[3]")).getText();
		
		System.out.println(temp);
		
		if (temp.equals(fname+lname))
		{
			test.log(LogStatus.PASS, "Search found");
		}
		else
		{
			test.log(LogStatus.FAIL, "Search not found");
		}
		
		assertEquals(temp,fname+lname);
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection()  {

		EmployeeListPOM emp = PageFactory.initElements(driver, EmployeeListPOM.class);
		
		emp.selectInspect();
		
		String temp = driver.findElement(By.id("pim.navbar.employeeName")).getText();
		
		if(temp.equals(fname+lname))
		{
			test.log(LogStatus.PASS, "User selected for inspection");
		}
		else 
		{
			test.log(LogStatus.FAIL, "User not selected for inspection");
		}
	}
	
}
