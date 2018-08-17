package com.qa.assessment.Assessment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	
	@FindBy (id = "txtUsername")
	private WebElement User;
	
	@FindBy (id = "txtPassword")
	private WebElement Pass;
	
	@FindBy (id = "btnLogin")
	private WebElement Login;
	
	public void logIn(String user, String pass)
	{
		User.sendKeys(user);
		Pass.sendKeys(pass);
		
		Login.click();
	}
}
