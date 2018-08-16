package com.qa.demo.DemoQA;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DemoQASelectPOM {

	@FindBy(xpath="//*[@id=\"tabs\"]/ul/li[2]")
	private WebElement tab;
	
	@FindBy(xpath="//*[@id=\"selectable_grid\"]/li[1]")
	private WebElement but1;
	
	@FindBy(xpath="//*[@id=\"selectable_grid\"]/li[2]")
	private WebElement but2;
	
	@FindBy(xpath="//*[@id=\"selectable_grid\"]/li[3]")
	private WebElement but3;
	
	public void butSelect(WebDriver driver)
	{
		tab.click();
		
		Actions action = new Actions(driver);
		
		but1.click();
		but2.click();
		
		action.keyDown(Keys.CONTROL).perform();
		
		but3.click();
		
		action.keyUp(Keys.CONTROL).perform();
	}


}
