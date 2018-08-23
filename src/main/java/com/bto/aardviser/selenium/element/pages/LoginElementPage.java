package com.bto.aardviser.selenium.element.pages;

import org.openqa.selenium.By;


public class LoginElementPage  {

	By searchBox = By.name("q");
	By searchButton = By.name("btnK");
	
	public By getSearchBox() {
		return searchBox;
	}
	public void setSearchBox(By searchBox) {
		this.searchBox = searchBox;
	}
	public By getSearchButton() {
		return searchButton;
	}
	public void setSearchButton(By searchButton) {
		this.searchButton = searchButton;
	}
	
	
	 
}
