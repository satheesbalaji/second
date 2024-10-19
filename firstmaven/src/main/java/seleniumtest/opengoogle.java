package seleniumtest;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();


		driver.findElement(By.className("gLFyf")).sendKeys("welcome");
		driver.findElement(By.className("gLFyf")).submit();
		
		driver.quit();
		


	}

}
