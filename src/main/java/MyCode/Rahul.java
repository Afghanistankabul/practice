package MyCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class Rahul {
    public static void main(String[] args) {


       /* WebDriverManager.chromedriver().setup();
        ChromeDriver myDriver = new ChromeDriver();

        myDriver2.get("https://www.facebook.com/");// it will open the browser and inter the url show us the page
        System.out.println(myDriver2.getTitle());   // it will print us the title of the current page
        System.out.println(myDriver2.getCurrentUrl()); // it will print the current  url for us
        myDriver2.close();    // it will close the current page & window
        myDriver2.quit();    // it will close all the window of the browser which opened by the selenium for testing*/

        // Note : to run your test on different web browsers
        // just change the name of your browser in the code line



      /*  WebDriverManager.firefoxdriver().setup(); // it will get the driver path for you
        FirefoxDriver myDriver2 =new FirefoxDriver();  // it will only open the browser

        myDriver2.get("https://www.facebook.com/");// it will open the browser and inter the url show us the page
        System.out.println(myDriver2.getTitle());   // it will print us the title of the current page
        System.out.println(myDriver2.getCurrentUrl()); // it will print the current  url for us
        myDriver2.close();    // it will close the current page & window
        myDriver2.quit();    // it will close all the window of the browser which opened by the selenium for testing */

        WebDriverManager.edgedriver().setup(); // it will get the driver path for you
        EdgeDriver myDriver3 =new EdgeDriver();  // it will only open the browser

        myDriver3.get("https://www.facebook.com/");// it will open the browser and inter the url show us the page
        System.out.println(myDriver3.getTitle());   // it will print us the title of the current page
        System.out.println(myDriver3.getCurrentUrl()); // it will print the current  url for us
        myDriver3.close();    // it will close the current page & window
        myDriver3.quit();    // it will close all the window of the browser which opened by the selenium for testing
        myDriver3.getPageSource();  // it will show all the page sources for us
    }
}
