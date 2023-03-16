import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
    @BeforeMethod
    public void before (){
        System.out.println("i started first");
    }
    @Test(priority = 1,groups = {"smoke"})
    public void setup(){

        System.out.println("browser started ");

    }
    @Test(priority = 2,groups = {"santy"})
    public void user (){
        System.out.println("valid user name entered ");
    }
    @Test(priority = 3,groups = {"manual"})
    public void testEnded (){
        System.out.println("close the test");
    }
    @AfterMethod
    public void after(){
        System.out.println("i started after every each method ");
    }
}
