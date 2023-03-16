package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxesAndGettingSize {
    public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      String url = driver.getCurrentUrl();





      driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        System.out.println( driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        if (url.contains("dropdowns")){
            System.out.println("this is the right url");
        }else {
            System.out.println("this is the wrong url");
        }






    }
}
