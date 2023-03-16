package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpahtPractice {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver myDriver = new ChromeDriver();
        myDriver.get("https://www.cnn.com/account/log-in");

        myDriver.findElement(By.cssSelector("input#login-email-input")).sendKeys("mustafa.ayan29@yahoo.com");
   myDriver.findElement(By.xpath("/html/body/div[1]/section[2]/section/section/section/div[1]/div[2]/div/form/button[2]")).click();

    }
}
