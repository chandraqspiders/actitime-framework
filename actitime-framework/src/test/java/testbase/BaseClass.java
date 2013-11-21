package testbase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Launch browser");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("Quit");
  }

}
