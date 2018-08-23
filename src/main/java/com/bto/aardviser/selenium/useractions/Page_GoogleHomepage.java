package com.bto.aardviser.selenium.useractions;
 

import org.openqa.selenium.By;

import com.bto.aardviser.selenium.common.CommonElementPages;
 
public class Page_GoogleHomepage extends CommonElementPages {
 
	public void openGoogleURL() {
		driver.get("http://www.google.com");
	}
		
	public void checkSearchBoxIsDisplayed() {
		if(driver.findElement(login.getSearchBox()).isDisplayed()) {
			System.out.println("Search text box is displayed");
		} else {
			System.out.println("Search text box is NOT displayed");
		}
	}
	
	public void checkGoogleSearchButtonIsDisplayed() {
		if(driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google Search button is displayed");
		} else {
			System.out.println("Google Search button is NOT displayed");
		}
	}
	
	public void checkImFeelingLuckyButtonIsDisplayed() {
		if(driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm Feeling Lucky button is displayed");
		} else {
			System.out.println("I'm Feeling Lucky button is NOT displayed");
		}
	}
}