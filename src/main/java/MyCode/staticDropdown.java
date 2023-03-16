package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver myDrive = new ChromeDriver();
        myDrive.get("https://rahulshettyacademy.com/dropdownsPractise/");


        // Note we can use this why only when the tag name should be select

       WebElement country = myDrive.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(country);
        dropdown.selectByIndex(3);
        System.out.println( dropdown.getFirstSelectedOption().getText());


        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println(dropdown.getOptions().size());







    }
}
