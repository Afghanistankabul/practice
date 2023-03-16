package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Class {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        myDriver.get("https://rahulshettyacademy.com/");
        myDriver.findElement(By.className("fa-user")).click();
        myDriver.findElement(By.id("user_name")).sendKeys("Mustafa Ayan");
        myDriver.findElement(By.id("user_email")).sendKeys("mustafa.ayan29@yahoo.com");
        myDriver.findElement(By.className("password")).sendKeys("Mayan123!");
        myDriver.findElement(By.className("m-l-0-xs")).click();
        myDriver.findElement(By.className("button")).click();
        System.out.println(myDriver.findElement(By.cssSelector("div.bodySmall ")).getText());
        myDriver.findElement(By.cssSelector("a[data-test-id='login-button']")).click();
        myDriver.findElement(By.id("email")).sendKeys("mustafa.ayan29@yahoo.com");
        myDriver.findElement(By.name("password")).sendKeys("Mayan123!");
        myDriver.findElement(By.name("commit")).click();


        }
    }







