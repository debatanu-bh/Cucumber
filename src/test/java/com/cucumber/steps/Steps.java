package com.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utils.WebDriverUtils.getDriver;

public class Steps {
    WebDriver chrDriver;
    @Given("User is on login page")
    public void user_is_on_login_page() {
        chrDriver=getDriver();
        chrDriver.get("http://www.google.com");

    }
    @When("The user enters the valid credential")
    public void the_user_enters_the_valid_credential() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_enters_the_valid_credential");
       // throw new io.cucumber.java.PendingException();
    }
    @When("hits submit button")
    public void hits_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hits_submit_button");
      //  throw new io.cucumber.java.PendingException();
    }
    @Then("login is sucessful")
    public void login_is_sucessful() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login_is_sucessful");
    //    throw new io.cucumber.java.PendingException();
    }

    @Given("User enters correct credentials")
    public void user_enters_correct_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user_enters_correct_credentials");
    }
    @When("The user enters password and login")
    public void the_user_enters_password_and_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_user_enters_password_and_login()");
    }
    @When("clicks submit")
    public void clicks_submit() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicks_submit()");
    }
    @Then("LoginSuccess")
    public void login_success() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login_success()");
    }

}
