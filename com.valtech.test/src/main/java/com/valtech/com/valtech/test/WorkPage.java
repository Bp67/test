package com.valtech.com.valtech.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkPage {
	
	
	private WebDriver Driver;
	public WorkPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.Driver = driver;
	}
	
	@FindBy(css="h1")
	public WebElement headerText;
	
	public String GetHeaderText(){
		
		return headerText.getText();
	}

	
}
