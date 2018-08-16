package com.qa.demo.DemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQAHomePOM {

	@FindBy(linkText="Droppable")
	private WebElement droplink;
	
	@FindBy(linkText="Selectable")
	private WebElement selectlink;
	
	@FindBy(linkText="Accordion")
	private WebElement accordlink;
	
	@FindBy(linkText="Autocomplete")
	private WebElement autolink;
	
	@FindBy(linkText="Datepicker")
	private WebElement datelink;
	
	@FindBy(linkText="Menu")
	private WebElement menulink;

	@FindBy(linkText="Slider")
	private WebElement sliderlink;
	
	@FindBy(linkText="Tabs")
	private WebElement tabslink;
	
	@FindBy(linkText="Tooltip")
	private WebElement toollink;
	
	@FindBy(linkText="Registration")
	private WebElement reglink;
	
	public void clickDrop()
	{
		droplink.click();
	}
	
	public void clickSelect()
	{
		selectlink.click();
	}
	
	public void clickAccord()
	{
		accordlink.click();
	}
	
	public void clickAuto()
	{
		autolink.click();
	}
	
	public void clickDate()
	{
		datelink.click();
	}
	
	public void clickMenu()
	{
		menulink.click();
	}
	
	public void clickSlider()
	{
		sliderlink.click();
	}
	
	public void clickTab()
	{
		tabslink.click();
	}
	
	public void clickTool()
	{
		toollink.click();
	}
	
	public void clickReg()
	{
		reglink.click();
	}
}
