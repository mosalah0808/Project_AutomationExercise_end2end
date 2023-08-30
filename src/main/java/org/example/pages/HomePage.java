package org.example.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    final WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(xpath = "//a[@href =\"/login\"]")
    WebElement login;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement loggedInAsTitle;

    @FindBy(xpath = "//a[@href =\"/delete_account\"]")
    WebElement deleteAccount;


    //Methods

    public void goToHomePage() {
        driver.get("http://automationexercise.com");
    }

    public void clickLogin() {
        login.click();
    }

    public void checkloggedInAsTitleIsVisisble() {
        Assertions.assertTrue(loggedInAsTitle.isDisplayed(),"Элемент Logged IN AS не отображается");

    }
    public void clickDeleteAccount() {
        deleteAccount.click();
    }
    public void tearDown() {

    }


}
