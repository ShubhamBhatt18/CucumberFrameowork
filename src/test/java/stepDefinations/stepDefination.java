package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Net Banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
       System.out.println("navigaed to login url");
    }

  /*  @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
       System.out.println("Login successful");
    }*/
    
    //When you have different data taht needs to be passed in implementation methods
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       System.out.println(strArg1);
       System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home page gets populated");
    }

    @And("^All the credit card associated with the username are displayed$")
    public void all_the_credit_card_associated_with_the_username_are_displayed() throws Throwable {
        System.out.println("USername displayed");
    }

}