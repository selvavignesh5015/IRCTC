package OverviewOfCucumber;

 
 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginbindings {
	
	@Given("I launch the application")
	public void i_launch_the_application() {
		  signinform.button();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {
		 signinform.login(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I clicked login button")
	public void i_clicked_login_button() {
		signinform.loginbutton();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Click on Fish")
	public void click_on_fish() {
	      signinform.button();
	      signinform.login("j2ee");
	      signinform.loginbutton();
		
		   Fish.clickOnFish();
		
	    // Write code here that turns the phrase above into concrete actions
	    // throw new io.cucumber.java.PendingException();
	}
	@Given("Click on Birds")
	public void click_on_birds() {
		  signinform.button();
	      signinform.login("j2ee");
	      signinform.loginbutton();
		
		    Birds.clickOnBird();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


	@Given("Click on F1-SW-{int}")
	public void click_on_f1_sw(Integer int1) {
		Fish.ProID();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("Click on AV-CB-{int}")
	public void click_on_av_cb(Integer int1) {
		 Birds.ProID();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	 

	@Given("add to cart")
	public void add_to_cart() {
		Fish.addtocart();
		Birds.addtocart();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Proceed to checkout")
	public void proceed_to_checkout() {
		Fish.proceedToCheckout();
		Birds.proceedToCheckout();;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Click on continue")
	public void click_on_continue() {
		Fish.ContinueBtn();
		Birds.ContinueBtn();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Click on confirm")
	public void click_on_confirm() {
		Fish.ConfirmBtn();
		Birds.ConfirmBtn();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	
	

	
	
	
	
	
	

//	@Given("I launch the application")
//	public void i_launch_the_application() throws Throwable {
//		signinform.button();
//		// throw new PendingException();
//	}
//
//	@When("I enter the username {string}")
//	public void i_enter_the_username(String string) {
//
//		signinform.login(string);
//		// Write code here that turns the phrase above into concrete actions
//		// throw new io.cucumber.java.PendingException();
//	}
//
//	@And("I clicked login button")
//	public void i_clicked_login_button() throws Throwable {
//		signinform.loginbutton();
//		// throw new PendingException();
//	}
//
//	@Given("Click on Fish")
//	public void click_on_fish() {
//		Fish.clickOnFish();
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("Click on prodid")
//	public void click_on() {
//		Fish.ProID();
//		Birds.ProID();
//		
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("add to cart")
//	public void add_to_cart() {
//		Fish.addtocart();
//		Birds.addtocart();
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("Proceed to checkout")
//	public void proceed_to_checkout() {
//		Fish.proceedToCheckout();
//		Birds.proceedToCheckout();
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("Click on continue")
//	public void click_on_continue() {
//		Fish.ContinueBtn();
//		Birds.ContinueBtn();
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Click on confirm")
//	public void click_on_confirm() {
//		Fish.ConfirmBtn();
//		Birds.ConfirmBtn();
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("Click on Birds")
//	public void click_on_birds() {
//		 Birds.clickOnBird();
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}

}