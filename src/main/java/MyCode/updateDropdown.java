package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver myDriver1 =new ChromeDriver();
        myDriver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
        myDriver1.findElement(By.id("divpaxinfo")).click();
        System.out.println(myDriver1.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000l);
      /* int i = 1;
        while (i < 5) {
            myDriver1.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
*/

        for (int a = 1; a <5; a++){
            myDriver1.findElement(By.id("hrefIncAdt")).click();
        }
            System.out.println( myDriver1.findElement(By.id("divpaxinfo")).getText());


    }
}
