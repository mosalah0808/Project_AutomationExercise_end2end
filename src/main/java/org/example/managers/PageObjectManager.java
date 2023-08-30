package org.example.managers;

import org.example.pages.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SignupPage signupPage;
    private AccountCreatedPage accountCreatedPage;
    private DeleteAccountPage deleteAccountPage;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public PageObjectManager(HomePage homePage) {
        this.homePage = homePage;
    }


    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public SignupPage getSignupPage() {
        return (signupPage == null) ? signupPage = new SignupPage(driver) : signupPage;
    }

    public AccountCreatedPage getaccountCreatedPage() {
        return (accountCreatedPage == null) ? accountCreatedPage = new AccountCreatedPage(driver) : accountCreatedPage;
    }

    public DeleteAccountPage getDeleteAccountPage() {
        return (deleteAccountPage == null) ? deleteAccountPage = new DeleteAccountPage(driver) : deleteAccountPage;
    }


}
