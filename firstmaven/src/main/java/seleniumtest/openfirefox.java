package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		FirefoxDriver driver  = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}

}
 