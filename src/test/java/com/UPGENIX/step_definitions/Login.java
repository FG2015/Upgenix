package com.UPGENIX.step_definitions;

import com.UPGENIX.pages.LoginPage;
import com.UPGENIX.utilities.Configuration_Reader;
import com.UPGENIX.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


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
                loginPage.passwordBox.sendKeys("posma123");

        }
        @Then("user see {string} message displayed")
        public void user_see_message_displayed(String string) {
                String expectedResult = "Wrong login/password";
                String actualResult=loginPage.WrongLoginOrPassword.getText();

        }
        @And("user is back on the login page")
        public void userIsBackOnTheLoginPage() {
                Driver.getDriver().get(" https://qa.upgenix.net/web/login");
        }
        @When("user leave  password box empty")
        public void user_leave_password_box_empty() {
                loginPage.passwordBox.sendKeys(" ");

        }
        @Then("user see {string} message on the page")
        public void user_see_message_on_the_page(String string) {
                String ExpectedResult="Please Fill out this field";
                boolean actualResult = loginPage.passwordBox.isEnabled();
                Assert.assertTrue(ExpectedResult, actualResult);


        }
        @When("user should see the password in bullet signs")
        public void user_should_see_the_password_in_bullet_signs() {
               Boolean isBullet= loginPage.passwordBox.getAttribute("id").equals("password");
                Assert.assertEquals(isBullet,true);
        }
        @Then("user click ENTER key")
        public void user_click_enter_key() {
                loginPage.passwordBox.sendKeys(Keys.ENTER);
                String title = Driver.getDriver().getTitle();
                Assert.assertEquals(title,"Odoo" );

        }






}








