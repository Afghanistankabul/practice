package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EmplicitiTime {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver myDrive= new ChromeDriver();
        myDrive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        myDrive.get("https://www.clientam.com/sso/Login");
        myDrive.findElement(By.id("submitForm")).click();


        System.out.println(myDrive.findElement(By.id("ERRORMSG")).getText());
    }
}
