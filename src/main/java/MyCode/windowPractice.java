package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver myDriver = new ChromeDriver();
        myDriver.manage().window().maximize();
        myDriver.get("https://www.google.com/");
        myDriver.navigate().to("https://rahulshettyacademy.com");
        myDriver.navigate().back();
        myDriver.navigate().forward();
    }
}
