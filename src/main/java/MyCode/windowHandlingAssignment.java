package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandlingAssignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
       Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentID= it.next();
        String childID= it.next();
        driver.switchTo().window(childID);
        String text=driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
        System.out.println(text);
        driver.switchTo().window(parentID);
        String text1 =driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
        System.out.println(text1);
        driver.close();



    }
}
