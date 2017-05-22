package com.valtech.com.valtech.test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	
	private WebDriver Driver;
	public ContactPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.Driver = driver;
	}
	
	@FindBy(css="[data-icon='location']")
	public List<WebElement> locations;
	
	@FindBy(css="contactheader")
	public WebElement contactHeader;
	
	
}
