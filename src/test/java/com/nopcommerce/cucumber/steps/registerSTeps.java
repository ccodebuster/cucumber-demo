package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class registerSTeps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) throws InterruptedException {
      List<List<String>>data = dataTable.raw();
      for(int i=0; i<data.size();i++ ){

          new LoginPage().register(data.get(i).get(0),data.get(i).get(1),data.get(i).get(2),data.get(i).get(3),data.get(i).get(4));
          /*new LoginPage().clickOnLoginButton();
          new LoginPage().clickOnLogOutLink();*/
      }
    }

}
