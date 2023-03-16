package myExtendReportPackage;

import MustafaAyanExtentReport.base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 extends base {
    WebDriver driver;
    @Test
    public void initialDemo2()
    {
        WebDriver driver = initializeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
