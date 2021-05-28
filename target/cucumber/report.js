$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "A user will be able to contact the site owner or management",
  "description": "team using a form. They will enter their information as well as a message,\r\nthen submit the form to send the information to the server.",
  "id": "a-user-will-be-able-to-contact-the-site-owner-or-management",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1936607300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Send information via the Contact Us form",
  "description": "",
  "id": "a-user-will-be-able-to-contact-the-site-owner-or-management;send-information-via-the-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "A user clicks the Contact Us link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user enters their first name",
  "rows": [
    {
      "cells": [
        "Jane",
        "John",
        "Dom",
        "Samantha"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user enters their last name",
  "rows": [
    {
      "cells": [
        "Doe",
        "Smith",
        "Wiles",
        "Parker"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "The user enters a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "The user enters some comments",
  "rows": [
    {
      "cells": [
        "It\u0027s a comment",
        "This is a comment",
        "I am commenting on what a lovely day this is"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user clicks the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "The user should have their data sent successfully to the site",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.a_user_clicks_the_Contact_Us_link()"
});
formatter.result({
  "duration": 1815141200,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_user_enters_their_first_name(String\u003e\u003e)"
});
formatter.result({
  "duration": 175418200,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_user_enters_their_last_name(String\u003e\u003e)"
});
formatter.result({
  "duration": 136055000,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_user_enters_a_valid_email_address()"
});
formatter.result({
  "duration": 141030800,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_user_enters_some_comments(String\u003e\u003e)"
});
formatter.result({
  "duration": 125577100,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_user_clicks_the_Submit_button()"
});
formatter.result({
  "duration": 1714319300,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.the_user_should_have_their_data_sent_successfully_to_the_site()"
});
formatter.result({
  "duration": 50415200,
  "status": "passed"
});
formatter.after({
  "duration": 747686200,
  "status": "passed"
});
formatter.uri("Products.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I can make purchases to the site via a Store Page.",
  "description": "",
  "id": "as-a-user,-i-can-make-purchases-to-the-site-via-a-store-page.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Navigate to the Store page and validate a promo code alert pops up.",
  "description": "",
  "id": "as-a-user,-i-can-make-purchases-to-the-site-via-a-store-page.;navigate-to-the-store-page-and-validate-a-promo-code-alert-pops-up.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "A user navigates to the \"\u003curl\u003e\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user clicks the button \"\u003cbutton\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The user should receive an alert concerning a Special Offer",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-a-user,-i-can-make-purchases-to-the-site-via-a-store-page.;navigate-to-the-store-page-and-validate-a-promo-code-alert-pops-up.;",
  "rows": [
    {
      "cells": [
        "url",
        "button"
      ],
      "line": 9,
      "id": "as-a-user,-i-can-make-purchases-to-the-site-via-a-store-page.;navigate-to-the-store-page-and-validate-a-promo-code-alert-pops-up.;;1"
    },
    {
      "cells": [
        "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
        "special-offers"
      ],
      "line": 10,
      "id": "as-a-user,-i-can-make-purchases-to-the-site-via-a-store-page.;navigate-to-the-store-page-and-validate-a-promo-code-alert-pops-up.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1302513300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Navigate to the Store page and validate a promo code alert pops up.",
  "description": "",
  "id": "as-a-user,-i-can-make-purchases-to-the-site-via-a-store-page.;navigate-to-the-store-page-and-validate-a-promo-code-alert-pops-up.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "A user navigates to the \"http://www.webdriveruniversity.com/Page-Object-Model/products.html\" website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user clicks the button \"special-offers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The user should receive an alert concerning a Special Offer",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.webdriveruniversity.com/Page-Object-Model/products.html",
      "offset": 25
    }
  ],
  "location": "ProductsSteps.a_user_navigates_to_the_website(String)"
});
formatter.result({
  "duration": 2138326000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "special-offers",
      "offset": 28
    }
  ],
  "location": "ProductsSteps.the_user_clicks_the_button(String)"
});
formatter.result({
  "duration": 105895200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsSteps.the_user_should_receive_an_alert_concerning_a_Special_Offer()"
});
formatter.result({
  "duration": 1762977000,
  "status": "passed"
});
formatter.after({
  "duration": 735038800,
  "status": "passed"
});
});