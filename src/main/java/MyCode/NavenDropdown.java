package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NavenDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/shop?FORM=Z9LHS4");
        driver.findElement(By.id("sb_form_q")).sendKeys("book");
        Thread.sleep(2);
       List<WebElement> a= driver.findElements(By.id("sa_ul"));
       for (WebElement list:a){
           System.out.println( list.getText());

       }
    }
}
