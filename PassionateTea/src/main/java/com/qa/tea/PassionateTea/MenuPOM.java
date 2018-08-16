package com.qa.tea.PassionateTea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

public class MenuPOM {
	
	@FindBy(xpath="//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement chOutRed;
	
	public void chOut()
	{
		chOutRed.click();
	}
	
}
