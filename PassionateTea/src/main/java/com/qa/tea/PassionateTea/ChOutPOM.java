package com.qa.tea.PassionateTea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChOutPOM {
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")
	private WebElement placeBut;
	
	public boolean checkOut()
	{
		if (placeBut.getText().equals("Place Order"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
