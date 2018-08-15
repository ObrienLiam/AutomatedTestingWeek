package com.qa.pairprog.PairProgramming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy (id = "email")
	WebElement username;
	
	@FindBy (xpath= "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	WebElement password;

	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input")
	WebElement confirmP;
	
	@FindBy (xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input")
	WebElement submit;


	public void addUser (WebDriver driver, int i) {
		Actions action = new Actions(driver);
		
		ExcelInit2 sheet = PageFactory.initElements(driver, ExcelInit2.class);
		
		String user = sheet.getCellData(i,0);
		String pass = sheet.getCellData(i,1);
		
		username.sendKeys(user);
		password.sendKeys(pass);
		confirmP.sendKeys(pass);
		submit.click();
		
	}

}
