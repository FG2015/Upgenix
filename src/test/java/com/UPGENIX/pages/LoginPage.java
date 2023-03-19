package com.UPGENIX.pages;

import com.UPGENIX.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "login")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;





}
