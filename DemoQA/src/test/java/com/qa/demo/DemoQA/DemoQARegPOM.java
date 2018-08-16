package com.qa.demo.DemoQA;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQARegPOM {

	@FindBy(id="name_3_firstname")
	private WebElement first_input;
	
	@FindBy(id="name_3_lastname")
	private WebElement last_input;
	
	@FindBy(id="phone_9")
	private WebElement phone_input;
	
	@FindBy(id="username")
	private WebElement user_input;
	
	@FindBy(id="email_1")
	private WebElement email_input;
	
	@FindBy(id="password_2")
	private WebElement pass_input;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement conpass_input;
	
	@FindBy(xpath="//*[@id=\"pie_register\"]/li[3]/div/div/input[1]")
	private WebElement dance_check;
	
	@FindBy(xpath="//*[@id=\"pie_register\"]/li[3]/div/div/input[2]")
	private WebElement read_check;
	
	@FindBy(xpath="//*[@id=\"pie_register\"]/li[3]/div/div/input[3]")
	private WebElement cricket_check;
	
	@FindBy(xpath="//*[@id=\"pie_register\"]/li[14]/div/input")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id=\"post-49\"]/div/p")
	private WebElement success;
	
	public void sendReg(XSSFSheet sheet, int i)
	{
		Cell f_name = sheet.getRow(i).getCell(0);
		Cell l_name = sheet.getRow(i).getCell(1);
		Cell phoneno = sheet.getRow(i).getCell(2);
		Cell username = sheet.getRow(i).getCell(3);
		Cell email_ad = sheet.getRow(i).getCell(4);
		Cell password = sheet.getRow(i).getCell(5);
		Cell confirmpass = sheet.getRow(i).getCell(6);
		Cell hobbies = sheet.getRow(i).getCell(7);
		
		String fname = f_name.getStringCellValue();
		String lname = l_name.getStringCellValue();
		String phone = String.valueOf((long)phoneno.getNumericCellValue());
		String user = username.getStringCellValue();
		String email = email_ad.getStringCellValue();
		String pass = password.getStringCellValue();
		String confpass = confirmpass.getStringCellValue();
		String hobbie = hobbies.getStringCellValue();
		
		if (hobbie.equals("1"))
		{
			dance_check.click();
		}
		else if (hobbie.equals("2"))
		{
			read_check.click();
		}
		else if (hobbie.equals("3"))
		{
			cricket_check.click();
		}		
		
		first_input.sendKeys(fname);
		last_input.sendKeys(lname);
		phone_input.sendKeys(phone);
		user_input.sendKeys(user);
		email_input.sendKeys(email);
		pass_input.sendKeys(pass);
		conpass_input.sendKeys(confpass);
		
		submit.click();
	}
}
