package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        String url = "https://rahulshettyacademy.com/dropdownsPractise/";
        driver.get(url);
        driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click();
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();





    }
}
