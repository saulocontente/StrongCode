$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/saulocontente/step_definitions/features/LoginFeature.feature");
formatter.feature({
  "name": "Login",
  "description": "As an user \nI Want to Register my informations\nTo create an user and get loggedin",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get successfully LoggedIn",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that I\u0027m at the home page index",
  "keyword": "Given "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.thatIMAtTheHomePageIndex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button Sign in",
  "keyword": "When "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.clickOnTheButtonSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the email address: contente.saulo@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.enterTheEmailAddress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the password: AmeDesafios",
  "keyword": "And "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.enterThePassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button Log In",
  "keyword": "When "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.clickOnTheButtonLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logged on account: Saulo Contente",
  "keyword": "Then "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.loggedOnAccount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Login info",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that I\u0027m at the home page index",
  "keyword": "Given "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.thatIMAtTheHomePageIndex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button Sign in",
  "keyword": "When "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.clickOnTheButtonSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the email address: contentesaulo@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.enterTheEmailAddress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the password: Ame1Desafio",
  "keyword": "And "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.enterThePassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button Log In",
  "keyword": "When "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.clickOnTheButtonLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error occured: Authentication failed.",
  "keyword": "Then "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.errorOccured(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Empty Login info",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "that I\u0027m at the home page index",
  "keyword": "Given "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.thatIMAtTheHomePageIndex()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button Sign in",
  "keyword": "When "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.clickOnTheButtonSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button Log In",
  "keyword": "When "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.clickOnTheButtonLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error occured: An email address required.",
  "keyword": "Then "
});
formatter.match({
  "location": "saulocontente.step_definitions.LoginSteps.errorOccured(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});