package TestNgExtent;

import ExtentReportUtility.ExtentReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
    ExtentReports extent;
    ExtentTest test;

    @BeforeMethod
    public void beforeMethod(){
        extent = ExtentReportManager.getExtentReport();
        test = extent.createTest("Facebook registration Test");
    }

    @AfterMethod
    public void afterMethod(){
        extent.flush();
    }

    @Test
    public void registrationTest(){
        test.info("Open the registration page");
        test.info("filled the registration details");
        test.info("Submit the registration page");
        test.info("The registration has been submitted");
        test.pass("Test passed");
    }


}
