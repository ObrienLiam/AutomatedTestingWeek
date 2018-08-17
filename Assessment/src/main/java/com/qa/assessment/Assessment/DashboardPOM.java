package com.qa.assessment.Assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPOM {

	@FindBy (id = "menu_pim_viewPimModule")
	private WebElement PIM;
	
	@FindBy (id = "menu_pim_addEmployee")
	private WebElement Employees;
	
	@FindBy (id = "menu_pim_viewEmployeeList")
	private WebElement viewEmp;
	
	public void clickPIM()
	{
		PIM.click();
	}
	
	public void clickAddEmp()
	{
		Employees.click();
	}
	
	public void clickViewEmp()
	{
		viewEmp.click();
	}
	
}
