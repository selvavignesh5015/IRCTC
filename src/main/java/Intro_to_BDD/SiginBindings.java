package Intro_to_BDD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SiginBindings {
	

	@Given("^I am on the LinkedIn homepage$")
    public void i_am_on_the_linkedin_homepage() throws Throwable {
       // throw new PendingException();
    }

    @Given("^I am on the LinkedIn sign-up page$")
    public void i_am_on_the_linkedin_signup_page() throws Throwable {
       // throw new PendingException();
    }

    @When("^I click on the Join now button$")
    public void i_click_on_the_join_now_button() throws Throwable {
       // throw new PendingException();
    }

    @When("^I enter my first name,  Last name, email and password$")
    public void i_enter_my_first_name_last_name_email_and_password() throws Throwable {
       // throw new PendingException();
    }

    @Then("^I should be directed to the sign-up page$")
    public void i_should_be_directed_to_the_signup_page() throws Throwable {
       // throw new PendingException();
    }

    @Then("^my account should be created successfully$")
    public void my_account_should_be_created_successfully() throws Throwable {
       // throw new PendingException();
    }

    @And("^I click on the Agree & Join button$")
    public void i_click_on_the_agree_join_button() throws Throwable {
      //  throw new PendingException();
    }



}
