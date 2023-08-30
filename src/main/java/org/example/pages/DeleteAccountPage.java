package org.example.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
    final WebDriver driver;

    //constructor
    public DeleteAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[b = 'Account Deleted!']")
    WebElement accountDeletedTitle;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;
    public void checkAccountDeletedIsVisisble() {
        Assertions.assertTrue(accountDeletedTitle.isDisplayed(),"Элемент New User Signup! не отображается");
        continueButton.click();
    }
}
