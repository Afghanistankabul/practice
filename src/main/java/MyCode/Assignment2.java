package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static MyCode.assignment2Utility.assignmentUtility;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String[] listProduct =  {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/shop");
        //assignment2Utility m =new assignment2Utility();
        assignmentUtility(driver,listProduct);



    }


}
