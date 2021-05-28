package com.cucumber.steps;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import com.cucumber.listener.Reporter;
import com.cucumber.utils.DriverFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends DriverFactory {
	
	@Given("^A user clicks the Contact Us link$")
	public void a_user_clicks_the_Contact_Us_link() throws IOException  {
		Reporter.addStepLog("Accessing Webdriveruniversity");
		contactUsPage.getContactUsPage();
	}

	@When("^The user enters their first name$")
	public void the_user_enters_their_first_name(List<List<String>> firstName) throws Exception  {
		contactUsPage.enterFirstName(firstName, 0, 1);
	}

	@And("^The user enters their last name$")
	public void the_user_enters_their_last_name(List<List<String>> lastName) throws Exception  {
		contactUsPage.enterLastName(lastName, 0, 1);
	}

	@And("^The user enters a valid email address$")
	public void the_user_enters_a_valid_email_address() throws Exception   {
		contactUsPage.enterEmailAddress("tom@fulp.com");
	}

	@And("^The user enters some comments$")
	public void the_user_enters_some_comments(List<List<String>> comment) throws Exception  {
		contactUsPage.enterComments(comment, 0, 0);
	}

	@And("^the user clicks the Submit button$")
	public void the_user_clicks_the_Submit_button() throws Exception   {
		contactUsPage.clickSubmit();
	}

	@Then("^The user should have their data sent successfully to the site$")
	public void the_user_should_have_their_data_sent_successfully_to_the_site() throws Exception  {
		//fail("Take a screenshot here");
		contactUsPage.confirmSubmissionSuccessful();
	}
}
