package MustafaAyanExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


public class Listeners extends base implements ITestListener {
    //WebDriver driver;
    ExtentReports extent = extentReporterNG.extentReportGenerator();
    ExtentTest test;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();


    public void onTestStart(ITestResult iTestResult) {
       // test = extent.createTest("Initail test");
        test= extent.createTest(iTestResult.getMethod().getMethodName());
        extentTest.set(test);

    }


    public void onTestSuccess(ITestResult iTestResult) {
        extentTest.get().log(Status.PASS, "Successful");


    }


    public void onTestFailure(ITestResult iTestResult) {
        WebDriver driver = null;
        extentTest.get().fail(iTestResult.getThrowable());
        Object testobject = iTestResult.getInstance();
        Class clazz = iTestResult.getTestClass().getRealClass();

        try {
            driver = (WebDriver) clazz.getDeclaredField("d").get(testobject);
        }catch (Exception e1){

        }


        try {
            extentTest.get().addScreenCaptureFromPath(getScreenshotPaht(iTestResult.getMethod().getMethodName(), driver), iTestResult.getMethod().getMethodName());
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extent.flush();


    }
}
