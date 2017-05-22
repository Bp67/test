package com.valtech.com.valtech.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	
	
	private WebDriver Driver;
	public AboutPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.Driver = driver;
	}
	
	@FindBy(css="h1")
	public WebElement headerText;
	
	public String GetHeaderText(){
		
		return headerText.getText();
	}
}
