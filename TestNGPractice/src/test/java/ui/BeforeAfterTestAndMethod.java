package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAndMethod {

	@BeforeTest
	public void loginToApp() {
		System.out.println("Logging into the app");
	}
	
	@BeforeMethod
	public void startLogger() {
		System.out.println("starting the logger");
	}

	@Test
	public void browsingInApp() {
		System.out.println("working in app");
	}
	
	@Test
	public void addingInApp() {
		System.out.println("working in app");
	}
	
	@AfterMethod
	public void stopLogger() {
		System.out.println("stopping the logger");
	}

	@AfterTest
	public void logoutOfApp() {
		System.out.println("Logging out of app");
	}

}
