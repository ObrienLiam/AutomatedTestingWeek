package com.qa.demo.DemoQA;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQAAssertPOM {
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]")
	private WebElement drop1;

	@FindBy(xpath="//*[@id=\"ui-id-6\"]")
	private WebElement drop2;
	
	public void headerClick()
	{
		drop2.click();
	}

}
