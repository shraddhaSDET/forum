package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utilities {
	
	WebDriver driver;
	
	public utilities(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		driver = new FirefoxDriver();
		return driver;
	}
	
	public void quit() {
		driver.quit();
	}
	
	
	

}
