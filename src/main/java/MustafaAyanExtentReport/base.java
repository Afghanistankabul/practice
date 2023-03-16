package MustafaAyanExtentReport;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class base {
    WebDriver driver;
    public WebDriver initializeDriver()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        return driver;
    }
    public String  getScreenshotPaht(String testCaseName,WebDriver driver ) throws IOException
        {
        TakesScreenshot st=(TakesScreenshot)driver;
        File source=st.getScreenshotAs(OutputType.FILE);
        String destPath=System.getProperty("user.dir")+"\\myReports\\"+testCaseName+".png";
        File file=new File(destPath);
        FileUtils.copyFile(source,file);
        return destPath;


    }
}
