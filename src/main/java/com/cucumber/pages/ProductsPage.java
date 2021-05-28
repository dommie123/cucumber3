package com.cucumber.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
	public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;
	public @FindBy(xpath = ".//*[@id='container-product2']") WebElement button_NewLaptops;
	public @FindBy(xpath = "//b[contains(text(),'NEWCUSTOMER773322')]") WebElement voucherCode;
	public @FindBy(xpath = "//button[contains(text(),'Proceed')]") WebElement button_Proceed_Popup;
	
	public ProductsPage() throws IOException {
		super();
	}
	
	public ProductsPage clickSpecialOffersButton() throws IOException, InterruptedException {
		waitAndClickElement(button_SpecialOffers);
		return new ProductsPage();
	}
	
	public ProductsPage clickProceedButton_Popup() throws IOException, InterruptedException {
		waitAndClickElement(button_Proceed_Popup);
		return new ProductsPage();
	}
	
	public String printSpecialOffersVoucherCode() throws InterruptedException {
		WaitUntilWebElementIsVisible(voucherCode);
		String voucherCodeValue = voucherCode.getText();
		System.out.println("Voucher Code: " + voucherCodeValue);
		return voucherCodeValue;
	}
}
