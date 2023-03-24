package com.UPGENIX.pages;

import com.UPGENIX.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(className = "oe_topbar_name")
    public WebElement userNameBtn;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logOutBtn;
    @FindBy(className="o_thread_title")
    public WebElement mainPage;
}