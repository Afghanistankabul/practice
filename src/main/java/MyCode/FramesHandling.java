package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.switchTo().frame(0); // we can also locate the frame in a web page by index
        // but this is not a good practice.
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        Actions myActionClass =new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        myActionClass.dragAndDrop(source,target).build().perform();

        // to get your diver out of the frame window back to normal
        // ude this method

        driver.switchTo().defaultContent();


    }

}
