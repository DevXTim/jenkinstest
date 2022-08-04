package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

@FindBy(id= "username")
public WebElement username;

    @FindBy(id= "password")
    public WebElement password;


}
