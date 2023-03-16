package myExtendReportPackage;

import MustafaAyanExtentReport.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4  {
    WebDriver driver;
    @Test
    public void Date()
    {
        String url = "https://rahulshettyacademy.com/dropdownsPractise/";
        driver.get(url);
        driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        driver.close();
        Assert.assertSame(url,"mustafa");
    }
}
