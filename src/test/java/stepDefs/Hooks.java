package stepDefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.Login;
import pages.Registration;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    Login login;
    Registration registration;


    @Before
    public void setUp() {
        ConfigReader.initProperties();
        Driver.createDriver();
        login = new Login();
        registration = new Registration();
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {

                File scrFile = ((TakesScreenshot)
                        Driver.getDriver()).getScreenshotAs(OutputType.FILE);
                try {
                    FileUtils.copyFile(scrFile, new File("target//screenshot.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("The error happened while taking screenshot and cleaning up after the test");
            e.getMessage();
        }
        Driver.getDriver().quit();

    }

}







