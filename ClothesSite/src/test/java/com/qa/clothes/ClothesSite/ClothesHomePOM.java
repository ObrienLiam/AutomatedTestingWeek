package com.qa.clothes.ClothesSite;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClothesHomePOM {

	@FindBy(name = "search_query")
	private WebElement searchBox;
	
	public void searchFor(String text)
	{
		searchBox.sendKeys(text);
		searchBox.submit();
	}

}
