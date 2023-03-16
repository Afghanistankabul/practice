package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver myDriver =new ChromeDriver();
        myDriver.get("https://testproject.io/");
        myDriver.findElement(By.xpath("//a[@title='Blog']/ancestor::ul//a[@title='Forum']")).click();

        // finding one element based on other element but both elements belongs to the same parent 




    }
}
