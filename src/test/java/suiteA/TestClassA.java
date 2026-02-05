package suiteA;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Base64;

public class TestClassA {

    public static void main(String[] args) throws InterruptedException {
        String username = "admin";
        String password = "admin";

        Base64.Encoder encoder = Base64.getEncoder();
        String encoded = encoder.encodeToString((username + ":" + password).getBytes());


        WebDriver driver=new ChromeDriver();
       /* driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(4000 );
        driver.quit();

        */

        // By using HasAuthentication in Selenium 4
        ((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        Thread.sleep(2000);
        driver.quit();
    }
}
