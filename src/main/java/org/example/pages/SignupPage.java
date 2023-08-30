package org.example.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    final WebDriver driver;

    //constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[b= 'Enter Account Information']")
    WebElement enterAccountInformationElement;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement signUpTitle;

    @FindBy(xpath = "//input[@id='name']")
    WebElement signUpName;
    @FindBy(xpath = "//input[@id='email']")
    WebElement signUpEmail;
    @FindBy(xpath = "//input[@id='password']")
    WebElement signUpPassword;

    @FindBy(xpath = "//div[@id='uniform-days']//option[@value='14']")
    WebElement signUpDateOfBirthDay;

    @FindBy(xpath = "//div[@id='uniform-months']//option[@value='4']")
    WebElement signUpDateOfBirthMonth;

    @FindBy(xpath = "//div[@id='uniform-years']//option[@value='1985']")
    WebElement signUpDateOfBirthYear;

    @FindBy(xpath = "//div[@id='uniform-newsletter']//input[@id='newsletter']")
    WebElement signUpNewsletterCheckBox;

    @FindBy(xpath = "//div[@id='uniform-optin']//input[@id='optin']")
    WebElement signUpOffersCheckBox;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement signUpFirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement signUpLastName;
    @FindBy(xpath = "//input[@id='company']")
    WebElement signUpCompany;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement signUpAdress;
    @FindBy(xpath = "//input[@id='address2']")
    WebElement signUpAdress2;

    @FindBy(xpath = "//select[@id='country']//option[@value='Canada']")
    WebElement signUpCountry;
    @FindBy(xpath = "//input[@id='state']")
    WebElement signUpState;
    @FindBy(xpath = "//input[@id='city']")
    WebElement signUpCity;
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement signUpZipCode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement signUpMobileNumber;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement signUpCreateAccountButton;

    public void checkEnterAccountInformationIsVisisble() {
        Assertions.assertTrue(enterAccountInformationElement.isDisplayed(),"Элемент Enter Account Information не отображается");
    }

    public void enterDataAndClickCreateAccountButton() {
        signUpTitle.click();
        //signUpName.sendKeys("Bas");
        //signUpEmail.sendKeys("Bas");
        signUpPassword.sendKeys("Bas");
        signUpDateOfBirthDay.click();
        signUpDateOfBirthMonth.click();
        signUpDateOfBirthYear.click();
        signUpNewsletterCheckBox.click();
        signUpOffersCheckBox.click();
        signUpFirstName.sendKeys("Bas");
        signUpLastName.sendKeys("Bas");
        signUpCompany.sendKeys("Bas");
        signUpAdress.sendKeys("Bas");
        signUpAdress2.sendKeys("Bas");
        signUpCountry.click();
        signUpState.sendKeys("Bas");
        signUpCity.sendKeys("Bas");
        signUpZipCode.sendKeys("Bas");
        signUpMobileNumber.sendKeys("Bas");
        signUpCreateAccountButton.click();

    }
}
