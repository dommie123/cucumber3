package com.cucumber.steps;

import java.io.IOException;

import com.cucumber.utils.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductsSteps extends DriverFactory {
	
	@Given("^A user navigates to the \"([^\"]*)\" website$")
	public void a_user_navigates_to_the_website(String url)  {
		getDriver().get(url);
	}

	@When("^The user clicks the button \"([^\"]*)\"$")
	public void the_user_clicks_the_button(String btnId) throws IOException, InterruptedException  {
	    productsPage.clickSpecialOffersButton();
	}

	@Then("^The user should receive an alert concerning a Special Offer$")
	public void the_user_should_receive_an_alert_concerning_a_Special_Offer() throws InterruptedException, IOException  {
		productsPage.printSpecialOffersVoucherCode();
		productsPage.clickProceedButton_Popup();
	}
}
