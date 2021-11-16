Feature: Register new user 

Background:
Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username ‘userName’ and password 'password’
And User click on Login button
Then User should be logged in to MyAccount dashboard

@RegisterTest
Scenario: Create new user account in Test Environment 
	Given user is on Retail website 
	When user click on Myaccount
	And user click on Register
	And user fill registration form with below information
	|firstName|lastName|email|telephone|password|passwordConfirm|subscribe|
	|alex|conor|alex112233@gmail.com|2021011122|WrongPass|WrongPass|yes|
	And user agree to privacy and policy 
	And user click on continue button 
	Then user should see successful message 'Your Account Has Been Created!'
	
	
	#Retail Page Feature:   - for this feature you have to have an existing account


Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
And User click on Continue button 
Then User should see a success message 

Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
And User click on continue button 
Then User should see a message ‘Success: Your account has been successfully updated.’