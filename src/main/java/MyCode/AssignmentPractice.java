package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AssignmentPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//label[2]//span[2]")).click();

        driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

       /* WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select position = new Select(dropDown);
        position.selectByIndex(2);
        System.out.println( position.getFirstSelectedOption().getText());
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();*/

    }
}
