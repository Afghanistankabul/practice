package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPractice {
    public static void main(String[] args) {
        for (int ayan = 0; ayan <+2; ayan++) {


            WebDriverManager.chromedriver().setup();
            ChromeDriver myDriver = new ChromeDriver();
            myDriver.get("https://www.amazon.com/");
            System.out.println(myDriver.getTitle());
            myDriver.quit();
        }
    }
}
