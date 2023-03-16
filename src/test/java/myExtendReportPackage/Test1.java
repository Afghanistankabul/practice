package myExtendReportPackage;

import MustafaAyanExtentReport.base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends base {
    WebDriver driver;
    @Test
    public void initailDemo1 () {

        WebDriver driver = initializeDriver();

        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        driver.close();
        Assert.assertEquals(driver.getTitle(),"Ayan");
    }
}
