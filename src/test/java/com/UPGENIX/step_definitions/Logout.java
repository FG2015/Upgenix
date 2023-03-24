package com.UPGENIX.step_definitions;

import com.UPGENIX.pages.HomePage;
import com.UPGENIX.pages.LoginPage;
import com.UPGENIX.utilities.Configuration_Reader;
import com.UPGENIX.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout {
  LoginPage loginPage=new LoginPage();
    HomePage homePage= new HomePage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(Configuration_Reader.getProperty("URL"));

    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.usernameBox.sendKeys("salesmanager15@info.com");
        loginPage.passwordBox.sendKeys("salesmanager");


    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();


    }
    @When("user is on the homepage")
    public void user_is_on_the_homepage() {
      String actualResult=homePage.mainPage.getText();
      Assert.assertEquals(actualResult, "Congratulations, your inbox is empty");

    }
    @When("user clicks on his username top right of the screen")
    public void user_clicks_on_his_username_top_right_of_the_screen() {
      homePage.userNameBtn.click();

    }
    @When("user click Log out")
    public void user_click_log_out() {
      homePage.logOutBtn.click();


    }

}
