package TestNgExtent;

import ExtentReportUtility.ExtentReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    ExtentReports extent;
    ExtentTest loginTest;

    @BeforeMethod
    public void beforeMethod() {
       extent= ExtentReportManager.getExtentReport();
       loginTest = extent.createTest("Facebook Login Test");
    }
    @AfterMethod
    public void afterMethod() {
        extent.flush();
    }
    @Test
    public void loginTest(){
        loginTest.info("Valid username");
        loginTest.info("Valid password");
        loginTest.info("Press submit button to login");
        loginTest.info("Verify homepage title");
        loginTest.fail("Validation failure");
        Assert.assertEquals("Facebook Login","Facebook homepage","Homepage validation is failed.");
        loginTest.fail("Test failed");
    }
}
