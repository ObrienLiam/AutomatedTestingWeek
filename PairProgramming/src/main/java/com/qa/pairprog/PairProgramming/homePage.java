package com.qa.pairprog.PairProgramming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class homePage {
	
	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement register;
	
	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	WebElement username;
	
	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement password;
	
	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	WebElement submit;
	
	public void register () {
		register.click();
	}
	
	public void logIn (WebDriver driver, int i) {
		
		ExcelInit2 sheet = PageFactory.initElements(driver, ExcelInit2.class);
		
		String user = sheet.getCellData(i,0);
		String pass = sheet.getCellData(i,1);
		
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}
	
	public ExtentTest testing(ExtentTest test)
	{
		
		return test;
	}

}
