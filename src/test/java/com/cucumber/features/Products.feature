Feature: As a user, I can make purchases to the site via a Store Page.

Scenario Outline: Navigate to the Store page and validate a promo code alert pops up.
	Given A user navigates to the "<url>" website
	When The user clicks the button "<button>" 
	Then The user should receive an alert concerning a Special Offer
	
	Examples:
	|			 					 url									|			button			|
	| http://www.webdriveruniversity.com/Page-Object-Model/products.html	|		special-offers 		|