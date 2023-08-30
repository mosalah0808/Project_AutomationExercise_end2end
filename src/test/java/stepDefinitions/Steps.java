package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.managers.PageObjectManager;
import org.example.pages.*;
import org.openqa.selenium.WebDriver;


public class Steps {
    WebDriver driver = null;
    HomePage homePage;
    LoginPage loginPage;
    SignupPage signupPage;
    AccountCreatedPage accountCreatedPage;
    DeleteAccountPage deleteAccountPage;
    PageObjectManager pageObjectManager;

    TestBase testBase = new TestBase();

    @Given("I am on HomePage'")
    public void i_am_on_home_page() {

        driver = testBase.initialize();
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();
        homePage.goToHomePage();
        homePage.clickLogin();

    }

    @When("Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        homePage.tearDown();
    }


    @Then("Verify 'New User Signup!' is visible")
    public void i_verify_that_new_user_signup_visible_successfully() {
        //driver = testBase.initialize();
        //pageObjectManager = new PageObjectManager(driver);
        loginPage = pageObjectManager.getLoginPage();

        loginPage.checkNewUserSignUpIsVisisble();
    }
    @When("Enter name and email address and  Click 'Signup' button")
    public void i_enter_name_and_email_and_click_signup() {
        loginPage.enterNameAndEmailAddresAndClickSignUp();
    }

    @Then("Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    public void i_verify_that_enter_account_information_is_visible_successfully() {
        signupPage = pageObjectManager.getSignupPage();
        signupPage.checkEnterAccountInformationIsVisisble();
    }
    @When("Enter account and address information  and  Click 'Create Account' button")
    public void i_enter_information_and_click_create_account_button() {

        signupPage.enterDataAndClickCreateAccountButton();
    }

    @Then("Verify that 'ACCOUNT CREATED!' is visible and Click 'Continue' button")
    public void i_verify_that_account_created_is_visible_successfully_and_click_continue_button() {
        accountCreatedPage = pageObjectManager.getaccountCreatedPage();
        accountCreatedPage.checkAccountCreatedIsVisisble();
    }

    @Then("Verify that 'Logged in as username' is visible")
    public void i_verify_that_logged_in_as_title_is_visible() {
        homePage.checkloggedInAsTitleIsVisisble();
    }
    @When("Click 'Delete Account' button")
    public void i_click_delete_account_button() {
        homePage.clickDeleteAccount();
    }

    @Then("Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button")
    public void i_verify_that_account_deleted_is_visible_successfully_and_click_continue_button() {
        deleteAccountPage = pageObjectManager.getDeleteAccountPage();
        deleteAccountPage.checkAccountDeletedIsVisisble();
    }
}