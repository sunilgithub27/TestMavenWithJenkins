package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    private WebDriver driver;

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

    @Test(groups = {"browserTest"})
    public void launchBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");
        options.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/documentation/webdriver/drivers/options/");
        driver.quit();
    }
}
