package BrowserSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTest {
    private WebDriver driver = null;

    @Test(groups = {"NumberManipulationTest"})
    public void testAdd(){
        int a = 45;
        int b = 65;
        int expected = 110;

        Assert.assertEquals(a+b, expected,"Addition failed");
    }

    @Test(groups = {"NumberManipulationTest"})
    public void testSubtract(){
        int a = 65;
        int b = 45;
        int expected = 20;
        Assert.assertEquals(a-b, expected,"Subtraction failed");
    }

    @Test(groups = {"NumberManipulationTest"})
    public void testMultiply(){
        int a = 45;
        int b = 65;
        int expected = 2925;
        Assert.assertEquals(a*b, expected,"Multiplication failed");
    }

    @Test(groups = {"NumberManipulationTest"})
    public void testDivide(){
        int a = 90;
        int b = 45;
        int expected = 2;
        Assert.assertEquals(a/b, expected,"Divide failed");
    }

    @Parameters("Browser")
    @Test(groups = {"browserTest"})
    public void launchBrowser(String browserName) {

        System.out.println("Launching browser " + browserName);
        if(browserName.contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-infobars");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--start-maximized");
            options.setAcceptInsecureCerts(true);
            driver = new ChromeDriver(options);
        }

        else if(browserName.contains("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--no-sandbox");
            firefoxOptions.addArguments("--disable-popup-blocking");
            firefoxOptions.addArguments("--start-maximized");
            firefoxOptions.setAcceptInsecureCerts(true);
            driver = new FirefoxDriver(firefoxOptions);
        }

        driver.get("https://www.selenium.dev/documentation/webdriver/drivers/options/");
        driver.findElement(By.xpath("//a[@href =\"/downloads\"]")).click();
        driver.quit();
    }
}
