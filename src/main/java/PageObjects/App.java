package PageObjects;

import org.openqa.selenium.WebDriver;

import utils.utilities;

/**
 * Hello world!
 * 
 */
public class App {

	WebDriver driver;

	public void openSite() {
		utilities utils = new utilities(driver);
		utils.getDriver().get("http://google.com");
		utils.quit();		
	}
}
