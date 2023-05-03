Feature: As a User, I want to Order the food

@Arc
Scenario: The user gives the invalid user name  and password
Given The user launch the chrome browser and maximize window
When The user launch the url of the Bisto bites
And The user click the account button
And The user give the Invalid user name
And The user give the Invalid password 
And The user click the login button
And The user check whether navigate to the home page or not 
Then The user close the browser

@Sanity
Scenario: To User successfully add the Dosa
Given To user Enter the browser and maximazie
When To user launch the url
And To user click the Home button
And To user dropdown the Dosa label
And To user click the dosa button
And To user select the Masala Dosa 
And To user check the Available Time

@arc
Scenario: The user fills out the registration form and ignores the confirm password
Given As a User Enter the browser and maximazie
When As a Userlaunch the url
And As a Userclick the account button
And As a user give a the Name
And As s user give a mail
And As a user give a number
And As a user give a password
And As a User click the register button


@user
Scenario: The User search the coke can and check the price 
Given He Enter the browser and maximazie
When He launch the url
And He click the search icon
And He Search coke can
And He select the coke can 
And He check the can dollar 

@moon
Scenario: The user select the Spanish Omelet
Given tester Enter the browser and maximazie
When tester  launch the url
And tester click search icon
And tester search the spanish omelet
And tester  click the Probability
And tester check the dollar 


@sun
Scenario: The user read Our Story
Given I want to Enter the browser and maximazie
When I want to launch the url
And  I want to click the Story option
And I want to check the spelling mistake 
Then I want to close the browser






