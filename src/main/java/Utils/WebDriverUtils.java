package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\CHromeDriver\\25.5.22\\chromedriver.exe");
        driver= new ChromeDriver();
//        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Login User comend");



        return driver;
    }

}
