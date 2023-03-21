package com.UPGENIX.step_definitions;

import com.UPGENIX.pages.LoginPage;
import com.UPGENIX.utilities.Configuration_Reader;
import com.UPGENIX.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login {
        LoginPage loginPage= new LoginPage();


        @Given("User  navigate to log in page")
        public void user_navigate_to_log_in_page() {
            Driver.getDriver().get(Configuration_Reader.getProperty("URL"));

        }
        @When("user enter valid user name")
        public void user_enter_valid_user_name() {
                loginPage.usernameBox.sendKeys("posmanager10@info.com");

        }
        @When("user enter valid password")
        public void user_enter_valid_password() throws InterruptedException {
                loginPage.passwordBox.sendKeys("posmanager");
                Thread.sleep(4000);

        }
        @When("user click {string} button")
        public void user_click_button(String string) {
                loginPage.loginButton.click();


        }
        @When("user enter invalid password")
        public void user_enter_invalid_password() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("user see {string} message displayed")
        public void user_see_message_displayed(String string) {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }



}








