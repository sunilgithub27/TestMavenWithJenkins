package ExtentReportUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

    static ExtentReports extent;

    public static ExtentReports getExtentReport(){
        if(extent==null){
            extent = new ExtentReports();
            ExtentSparkReporter extentReporter = new ExtentSparkReporter("./Reports/ExtentReport.html");
            extentReporter.config().setTheme(Theme.DARK);
            extentReporter.config().setReportName("My Sample Report");
            extentReporter.config().setDocumentTitle("My First extent Report");
            extent.attachReporter(extentReporter);
        }
        return extent;
    }
}
