package myExtendReportPackage;

import MustafaAyanExtentReport.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends base {
    WebDriver driver;
    @Test
    public void initialDemo3()
    {
        WebDriver driver = initializeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("hello");
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
        driver.close();
    }

}
