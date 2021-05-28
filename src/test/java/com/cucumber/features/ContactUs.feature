Feature: A user will be able to contact the site owner or management
team using a form. They will enter their information as well as a message,
then submit the form to send the information to the server. 

Scenario: Send information via the Contact Us form
	Given A user clicks the Contact Us link
	When The user enters their first name
	| Jane | John | Dom | Samantha | 
	And The user enters their last name
	| Doe | Smith | Wiles | Parker | 
	And The user enters a valid email address
	And The user enters some comments
	| It's a comment | This is a comment | I am commenting on what a lovely day this is |
	And the user clicks the Submit button
	Then The user should have their data sent successfully to the site
	