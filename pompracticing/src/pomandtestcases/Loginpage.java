package pomandtestcases;

import java.nio.channels.FileLockInterruptionException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Loginpage() {

	
		@Test 
		public void login() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			driver.get("https://demo.unicotaxi.com/admin/login");
			Pageobjectlogin.userName(driver).sendkkeys("sathees@ngfot.com");
			Pageobjectlogin.password(driver).sendkeys("1234567");
			Pageobjectlogin.loginbutton(driver).click();
			
			
					
		}

	}


