package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        String parentID = it.next();
        String childID = it.next();
        driver.switchTo().window(childID );
       System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());



       // Please email us at mentor@rahulshettyacademy.com with below template to receive response// this is before the code
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);



       // mentor@rahulshettyacademy.com //  this is after the code
       String emilID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

       driver.switchTo().window(parentID);
       driver.findElement(By.id("username")).sendKeys(emilID);


    }

}
