package org.example.pages;


import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    final WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(xpath = "//h2[text() = 'New User Signup!']")
    WebElement newUserSignUp;

    @FindBy(xpath = "//input[@name='name']")
    WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement signUpEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpButton;


    //Methods

    public void checkNewUserSignUpIsVisisble() {
        Assertions.assertTrue(newUserSignUp.isDisplayed(),"Элемент New User Signup! не отображается");
    }

    public void enterNameAndEmailAddresAndClickSignUp() {
        signUpName.sendKeys("Bas");
        signUpEmail.sendKeys("Bas3@gmail.com");
        signUpButton.click();
    }


}
