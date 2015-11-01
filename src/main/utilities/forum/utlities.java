package forum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utlities {
	
	public WebDriver getDriver() {
		WebDriver driver = new FirefoxDriver();
		return driver;		
	}

}
