package com.qa.assessment.Assessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPOM {

	@FindBy (id = "employee_name_quick_filter_employee_list_value")
	private WebElement searchbox;
	
	@FindBy (id = "quick_search_icon")
	private WebElement searchtool;
	
	@FindBy (id = "//*[@id=\\\"employeeListTable\\\"]/tbody/tr[1]/td[3]")
	private WebElement selecttool;
	
	public void searchBar(String fname, String lname)
	{
		
		searchbox.sendKeys(fname+lname);
		try {Thread.sleep(1000);}
		catch(Exception e) {}
		searchbox.sendKeys(Keys.ENTER);
		//searchtool.click();
	}
	
	public void selectInspect()
	{
		selecttool.click();
	}
}
