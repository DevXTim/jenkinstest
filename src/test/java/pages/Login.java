package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login extends BasePage{


@FindBy(id= "username")
public WebElement username;

    @FindBy(id= "password")
    public WebElement password;


    @FindBy(xpath ="//title[text()='Digital Bank']")
    public WebElement title;


    @FindBy (id="submit")
    public WebElement signInButton;




}
