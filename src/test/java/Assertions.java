import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {


    @Test()
    public void LogoTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver ayan = new ChromeDriver();
        ayan.get("https://testproject.io/");
        WebElement Logo = ayan.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/a/img[1]"));
        Assert.assertTrue(Logo.isDisplayed(),"logo not displayed on page");
    }




    }






