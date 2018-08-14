package common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public WebDriver driver;

	protected void loadDriver() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("driver/chromedriver.exe").getFile());
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		driver = new ChromeDriver();
	}
	
}
