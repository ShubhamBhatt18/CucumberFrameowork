Feature: Application Login

Scenario: Home page default login
Given User is on Net Banking landing page
When User login into application with username "john" and password "jhonny"
Then Home page is populated
And All the credit card associated with the username are displayed

Scenario: Home page default login
Given User is on Net Banking landing page
When User login into application with username "Ramesh" and password "Suresh"
Then Home page is populated
And All the credit card associated with the username are displayed 

d