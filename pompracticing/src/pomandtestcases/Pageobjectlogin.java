package pomandtestcases;

public class Pageobjectlogin {
	public static webElement userName(WebDriver driver) {
		return driver.findElement(By.name("username"));
		
	}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.name("password"));
	}
public static WebElement loginbutton(WebDriver driver) {
	return driver.findElement(By.xpath("//"))
	}
}
