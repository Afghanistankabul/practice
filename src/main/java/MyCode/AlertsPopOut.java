package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopOut {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url ="https://rahulshettyacademy.com/AutomationPractice/";
        String info = "Mustafa Ayan";
        String text ="Free Access to InterviewQues/ResumeAssistance/Material";

        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys(info);
        driver.findElement(By.id("alertbtn")).click();

        String popOut =driver.switchTo().alert().getText();
        System.out.println(popOut);
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        System.out.println(driver.findElement(By.linkText(text)).getText());
        if (driver.findElement(By.linkText(text)).getText().contains(text)){
            System.out.println("test passed ");
        }else {
            System.out.println("test fails");
        }
        driver.quit();

    }
}
