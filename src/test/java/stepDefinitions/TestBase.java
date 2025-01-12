package stepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class TestBase {
    public WebDriver driver;

    @Before
    public static WebDriver initialize() {
        System.out.println("Initialize  Web Driver");
        ChromeOptions ops = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver",System.getenv("CHROME_DRIVER"));
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return driver;

    }




}
