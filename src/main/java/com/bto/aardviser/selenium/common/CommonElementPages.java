package com.bto.aardviser.selenium.common;

import com.bto.aardviser.selenium.element.pages.LoginElementPage;

public class CommonElementPages extends BasePage {
	public LoginElementPage login;
	
	public void launchBrowser() {
		login = new LoginElementPage();
		loadDriver();
	}
	
}
