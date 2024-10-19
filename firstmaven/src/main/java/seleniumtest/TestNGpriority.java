package seleniumtest;

import org.testng.annotations.Test;

public class TestNGpriority {
	@Test (priority = 0)
	public void Installeclipse() {
		System.out.println("Eclipse installed");
	}
	@Test  (priority = 2)
	public void AddtestNG() {
		System.out.println("TestNG added");
	}
	@Test  (priority = 1)
	public void Addmavendependency() {
		System.out.println("Dependency added sucessfully");
	}

}
