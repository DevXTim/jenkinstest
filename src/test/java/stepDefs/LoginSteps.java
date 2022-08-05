package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class LoginSteps {


    @Given("user entered correct URL")
    public void user_entered_correct_url() {

    }

    @Then("verify the title of the webpage is Digital Bank")
    public void verify_the_title_of_the_webpage_is_digital_bank() {

        Assert.assertEquals("Title is not the same", "Digital Bank", Driver.getDriver().getTitle());
    }

    @Then("verify all sign-in text boxes and buttons are present")
    public void verify_all_sign_in_text_boxes_and_buttons_are_present() {



    }

    @Given("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String string, String string2) {

    }

    @When("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {

    }

    @Then("verify user is successfully logged in to the account")
    public void verify_user_is_successfully_logged_in_to_the_account() {

    }

    @Given("user enters invalid username {string} and password {string}")
    public void user_enters_invalid_username_and_password(String string, String string2) {

    }

    @Then("verify user login failed with an error message")
    public void verify_user_login_failed_with_an_error_message() {

    }

    @Given("user enters valid username {string} and invalid password {string}")
    public void user_enters_valid_username_and_invalid_password(String string, String string2) {

    }

    @Given("user enters invalid username {string} and valid password {string}")
    public void user_enters_invalid_username_and_valid_password(String string, String string2) {

    }


    @Given("user leaves username and password fields blank")
    public void user_leaves_username_and_password_fields_blank() {

    }


    @Given("user had more than {int} unsuccessful login attempts")
    public void user_had_more_than_unsuccessful_login_attempts(Integer int1) {

    }


}



