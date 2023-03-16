import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

WebDriver driver;



    @BeforeClass
    @Parameters({"browser "," url"})
    public void setup(String browser,String app){
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();


        }
        else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
           driver.get(app);

        }
        driver.get(app);



    }
    @Test()
    public void LogoTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver ayan = new ChromeDriver();
        ayan.get("https://testproject.io/");
       WebElement Logo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/a/img[1]"));
        Assert.assertTrue(Logo.isDisplayed(),"logo not displayed on page");
    }
}
