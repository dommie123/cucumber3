package com.cucumber.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
	
	public @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/input[1]") WebElement textfield_FirstName;
	public @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/input[2]") WebElement textfield_LastName;
	public @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/input[3]") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/textarea[1]") WebElement textfield_Message;
	public @FindBy(xpath = "//body/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/form[1]/div[1]/input[2]") WebElement button_Submit;
	
	public ContactUsPage() throws IOException {
		super();
	}
	
	public ContactUsPage getContactUsPage() throws IOException {
		getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		return new ContactUsPage();
	}
	
	public ContactUsPage enterFirstName(List<List<String>> data, int row, int column) throws Exception {
		sendKeysToWebElement(textfield_FirstName, data.get(row).get(column));
		return new ContactUsPage();
	}
	
	public ContactUsPage enterLastName(List<List<String>> data, int row, int column) throws Exception {
		sendKeysToWebElement(textfield_LastName, data.get(row).get(column));
		return new ContactUsPage();
	}
	
	public ContactUsPage enterEmailAddress(String email) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, email);
		return new ContactUsPage();
	}
	
	public ContactUsPage enterComments(List<List<String>> data, int row, int column) throws Exception {
		sendKeysToWebElement(textfield_Message, data.get(row).get(column));
		return new ContactUsPage();
	}
	
	public ContactUsPage clickSubmit() throws Exception {
		waitAndClickElement(button_Submit);
		return new ContactUsPage();
	}
	
	public ContactUsPage confirmSubmissionSuccessful() throws Exception {
		WebElement thanksContactUs = getDriver().findElement(By.xpath("//div[@id='contact_reply']"));
		WaitUntilWebElementIsVisible(thanksContactUs);
		assertEquals("thankyouforyourmessage!", thanksContactUs.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		return new ContactUsPage();
	}
}
