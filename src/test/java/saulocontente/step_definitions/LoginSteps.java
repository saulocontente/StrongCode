package saulocontente.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import saulocontente.core.DriverFactory;
import saulocontente.page.AccountPage;
import saulocontente.page.IndexPage;
import saulocontente.page.LoginPage;

public class LoginSteps {

    private IndexPage index = new IndexPage();
    private LoginPage login = new LoginPage();
    private AccountPage account = new AccountPage();

@Given("^that I'm at the home page index$")
public void thatIMAtTheHomePageIndex() {
    index.openIndexPage();
}

@When("^click on the button Sign in$")
public void clickOnTheButtonSignIn() {
    index.openLogin();
}

@When("^enter the email address: (.+)$")
public void enterTheEmailAddress(String string) {
    login.setEmail(string);
}

@When("^enter the password: (.+)$")
public void enterThePassword(String string) {
    login.setPassword(string);
}

@When("^click on the button Log In$")
public void clickOnTheButtonLogIn() {
    login.submitLogin();
}

@Then("^logged on account: (.+)$")
public void loggedOnAccount(String string) {
    Assert.assertEquals(string, account.accountName());
}

@Then("^Error occured: (.+)$")
public void errorOccured(String string) {
    Assert.assertEquals(string, login.errorAlert());
}

@After
public void closeDriver() {
    index.closeDriver();
}

}