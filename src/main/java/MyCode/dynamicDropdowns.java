package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver myDriver =new ChromeDriver();
        myDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        myDriver.manage().window().fullscreen();

        myDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        myDriver.findElement(By.xpath("//a[@value='DEL']")).click();
        System.out.println( myDriver.findElement(By.xpath("(//ul)[19]")).getSize());
        System.out.println( myDriver.findElement(By.xpath("(//ul)[19]")).getText());

       //  //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']   parent to child xpath


        Thread.sleep(2000l);
        System.out.println( myDriver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).getText());


        // note we can use select class for static dropdown
        // for dynamic dropdown we can use two ways by index and by parent to child



    }
}
