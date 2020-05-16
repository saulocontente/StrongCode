#Language: en

Feature: Login
As an user 
I Want to Register my informations
To create an user and get loggedin

Scenario: Get successfully LoggedIn
Given that I'm at the home page index
When click on the button Sign in
And enter the email address: contente.saulo@gmail.com
And enter the password: AmeDesafios 
When click on the button Log In
Then logged on account: Saulo Contente

Scenario: Invalid Login info
Given that I'm at the home page index
When click on the button Sign in
And enter the email address: contentesaulo@gmail.com
And enter the password: Ame1Desafio
When click on the button Log In
Then Error occured: Authentication failed.

Scenario: Empty Login info
Given that I'm at the home page index
When click on the button Sign in
When click on the button Log In
Then Error occured: An email address required.
