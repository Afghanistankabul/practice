package MustafaAyanExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public  class extentReporterNG {
    static ExtentReports extent;
    public static ExtentReports extentReportGenerator()
    {
        String path= System.getProperty("user.dir")+"\\myReports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Result");
        reporter.config().setDocumentTitle("Test Result");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Mustafa Ayan");
        return extent;

    }
}
