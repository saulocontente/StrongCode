#Language: en

Feature: Login
As an user 
I Want to Register my informations
To create an user and get loggedin

Scenario: Get successfully LoggedIn
Given that i'm at the home page index
When click on the button Sign in
When entered the loging informations
When click on the button Sign in
Then i'm gonna be loggedin