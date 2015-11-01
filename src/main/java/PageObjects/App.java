package PageObjects;

import org.openqa.selenium.WebDriver;

import forum.utlities;

/**
 * Hello world!
 *
 */
public class App{
	
	WebDriver driver;
	
    public void openSite(String url) {
    	new utlities().getDriver().get("http://google.com");
    }
}
