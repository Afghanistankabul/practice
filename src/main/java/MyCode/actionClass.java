package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
   static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Actions a =new Actions(driver);
        // move to the specific element
        WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
       // a.moveToElement(move).contextClick().build().perform();
        a.moveToElement(move).contextClick().build().perform();
        // the contextClick() method will perform write click
        // moveToElement this method will move our carsure to the element location

        // write in Capital latter
        WebElement capital =driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(capital).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();



    }
}
