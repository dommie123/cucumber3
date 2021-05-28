package com.cucumber.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.pages.ContactUsPage;
import com.cucumber.pages.ProductsPage;

public class DriverFactory {
	public static WebDriver driver;
	public static ContactUsPage contactUsPage;
	public static ProductsPage productsPage;

	public WebDriver getDriver() {

		// Read config
		try {
			Properties p = new Properties();
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\cucumber\\properties\\config.properties");
			p.load(input);
			String browserName = p.getProperty("browserName");
			
			switch (browserName) {
			case "firefox":
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.err.println("Unable to load browser! " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
			productsPage = PageFactory.initElements(driver, ProductsPage.class);
		}
		return driver;
	}
}
