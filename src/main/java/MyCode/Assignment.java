package MyCode;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.cnn.com/";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".indexes__ButtonContainer-oqeuru-1.brLPZF.indexes__AccountUserLogInButton-nujtvs-30.gjhHbD")).click();

       /* driver.findElement(By.id("checkBoxOption1")).click();
       System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println( driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        */


    }
}
