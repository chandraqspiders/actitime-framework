package testbase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
	@BeforeClass
	public void launchApp() {
		System.out.println("Launch browser");
	}
	@AfterClass
	public void quit() {
		System.out.println("Quit");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Login to application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout from application");
	}
}
