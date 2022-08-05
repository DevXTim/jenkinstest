package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Registration extends BasePage {

    @FindBy(id="title")
    public WebElement titleRegistrationField;

    @FindBy(id="firstName")
    public WebElement firstNameRegistrationField;

    @FindBy(id="lastName")
    public WebElement lastNameRegistrationField;

    @FindBy(xpath="//input[@value= 'M']")
    public WebElement genderMRegistrationField;

    @FindBy(xpath="//input[@value= 'F']")
    public WebElement genderFRegistrationField;

    @FindBy(id="dob")
    public WebElement dateOfBirthRegistrationField;

    @FindBy(id="ssn")
    public WebElement ssnRegistrationField;

    @FindBy(id="emailAddress")
    public WebElement emailRegistrationField;

    @FindBy(id="password")
    public WebElement passwordRegistrationField;

    @FindBy(id="confirmPassword")
    public WebElement confirmPasswordRegistrationField;

    @FindBy(xpath="//button[contains(text(), 'Next')]")
    public WebElement nextButton;

    @FindBy(xpath="//a[contains(text(), 'Sign in')]")
    public WebElement singInLink;
}









