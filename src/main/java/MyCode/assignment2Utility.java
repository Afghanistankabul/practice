package MyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class assignment2Utility {
    public static void assignmentUtility(WebDriver driver, String [] listProduct) {
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            List mylist = Arrays.asList(listProduct);
            if (mylist.contains(name)) {
                driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
            }


        }
    }
}
