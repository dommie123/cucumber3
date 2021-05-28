package com.cucumber.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.pages.BasePage;
import com.cucumber.utils.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {
	@Before
	public void setUp() {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			if (driver != null) {
				if (scenario.isFailed()) {
					scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
					BasePage.captureScreenshot();
				}
				driver.manage().deleteAllCookies();
				driver.close();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Method failure, tearDownAndScreenshotOnFailure! Exception: " + e.getMessage());
		}
	}
}
