package com.qa.demo.DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DemoQADropPOM {

	@FindBy(id="draggableview")
	private WebElement source;
	
	@FindBy(id="droppableview")
	private WebElement target;
	
	public void moveObject(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
}
