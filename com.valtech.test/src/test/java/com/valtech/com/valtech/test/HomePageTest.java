package com.valtech.com.valtech.test;

import org.junit.Test;

import junit.framework.Assert;
import support.Base;


public class HomePageTest extends Base{
	
	HomePage home = new HomePage(driver);
	AboutPage about = new AboutPage(driver);
	ServicesPage services = new ServicesPage(driver);
	WorkPage work = new WorkPage(driver);
	ContactPage contact = new ContactPage(driver);

@Test 
public void ValtechTest(){
	
	Assert.assertEquals("Latest news", home.latestNews.getText());  
	ClickOnMainMenu();
	home.aboutLink.click();
	WaitFor(true);
	Assert.assertEquals("About", about.GetHeaderText());
	ClickOnMainMenu();
	home.workLink.click();
	WaitFor(true);
	Assert.assertEquals("Work", work.GetHeaderText());
	ClickOnMainMenu();
	home.servicesLink.click(); 
	WaitFor(true);
	Assert.assertEquals("Services", services.GetHeaderText());
	home.contact.click();
	WaitFor(contact.contactHeader);
	System.out.println(contact.locations.size());
	
}


private void ClickOnMainMenu(){
	home.mainNavigation.click();
	WaitFor(home.aboutLink);
}


}