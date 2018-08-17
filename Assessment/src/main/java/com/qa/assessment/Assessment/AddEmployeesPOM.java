package com.qa.assessment.Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeesPOM {

	@FindBy (id = "firstName")
	private WebElement firstName;
	
	@FindBy (id = "lastName")
	private WebElement lastName;
	
	@FindBy (id = "employeeId")
	private WebElement eid;
	
	@FindBy (xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
	private WebElement locDrop;
	
	@FindBy (xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement addDet;
	
	@FindBy (id = "username")
	private WebElement userName;
	
	@FindBy (id = "password")
	private WebElement passWord;
	
	@FindBy (id = "confirmPassword")
	private WebElement conPass;
	
	@FindBy (xpath = "//*[@id=\"systemUserSaveBtn\"]")
	private WebElement save;

	
	public void addEmployee(WebDriver driver, String fname, String lname, String uid)
	{
		Actions action = new Actions(driver);
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		eid.sendKeys(uid);
		
		//new Select(locDrop).selectByVisibleText(drop);
		//new Select(locDrop).selectByIndex(2);
		
		locDrop.click();
		
		action.moveToElement(locDrop).moveByOffset(0, 130).perform();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		action.click().perform();
		//WebElement myDynamicElement = (new WebDriverWait(driver, 20)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select-options-aca0cd48-141d-bab0-2a6e-60e4aa4e677f\"]/li[3]/span"))); 
		
		//WebElement canDrop = driver.findElement(By.xpath("//*[@id=\"select-options-aca0cd48-141d-bab0-2a6e-60e4aa4e677f\"]/li[3]/span"));
		
		//action.moveToElement(canDrop).click().perform();
		
	}
	
	public void createLogin()
	{
		addDet.click();
	}
	
	public void addLogin(String user, String pass)
	{	
		
		userName.sendKeys(user);
		passWord.sendKeys(pass);
		conPass.sendKeys(pass);
	}
	
	public void clickSave()
	{
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		
		save.click();
		
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e) {}
	}
}
