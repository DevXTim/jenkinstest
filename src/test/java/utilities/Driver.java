package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;

public class Driver {

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase(Locale.ROOT).trim()) {
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari" :
                    driver = new SafariDriver();
                    break;
                case "ie" :
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public static void createDriver()  {
        // Desire capabilities is what type of session we want
        // We can copy-paste below capabilities from Browser Stack website
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "Chrome");
//        capabilities.setCapability("browserVersion", "latest");
//
//        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//        browserstackOptions.put("osVersion", "12.0");
//        browserstackOptions.put("deviceName", "Samsung Galaxy S22 Ultra");
//        browserstackOptions.put("realMobile", "true");
//        browserstackOptions.put("local", "false");
//        capabilities.setCapability("bstack:options", browserstackOptions);

        switch (ConfigReader.getProperty("browser")) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
//            case "remote":
//                try {
//                    driver = new RemoteWebDriver(new URL(URL), capabilities);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
//                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }

//    public static WebDriver getDriver() {
//        return driver;
//    }

}


