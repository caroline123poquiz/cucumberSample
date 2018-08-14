package common;

import element.pages.LoginElementPage;

public class CommonElementPages extends BasePage {
	public LoginElementPage login;
	
	public void launchBrowser() {
		login = new LoginElementPage();
		loadDriver();
	}
	
}
