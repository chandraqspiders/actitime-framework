package testbase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
  @BeforeMethod
  public void login() {
	  System.out.println("Login");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("Logout");
  }
  @BeforeClass
  public void launchApp() {
	  System.out.println("Launch browser");
  }
  @AfterClass
  public void quit() {
	  System.out.println("Quit");
  }

}
