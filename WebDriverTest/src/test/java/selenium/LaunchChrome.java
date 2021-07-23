package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Proxy;
import org.testng.Assert;

import java.util.Arrays;

public class LaunchChrome {
    public static void main(String[] ars )
    {
        System.setProperty("webdriver.gecko.driver","C:\\ESA-ESB\\WebDriverTest\\src\\main\\resources\\geckodriver_win.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }
}
