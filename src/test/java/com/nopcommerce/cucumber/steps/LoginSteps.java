package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully and see \"([^\"]*)\"$")
    public void iShouldNavigateToLoginPageSuccessfullyAndSee(String text)  {
        String welcomeMessage=new LoginPage().getWelcomeText();
        Assert.assertEquals(text,welcomeMessage,"Verifying welcome message");

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
       new LoginPage().enterEmailId(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
       new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I verify login successfully$")
    public void iVerifyLoginSuccessfully() {
    String logOutText=new LoginPage().getLogOutText();
    Assert.assertEquals(logOutText,"Log out");
    }

    @And("^I should see error \"([^\"]*)\"$")
    public void iShouldSeeError(String message)  {
      String errorMessage=new LoginPage().getErrorMessage();
      Assert.assertEquals(message,errorMessage);
    }
}
