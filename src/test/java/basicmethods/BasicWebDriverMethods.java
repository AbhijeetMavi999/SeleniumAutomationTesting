package basicmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title: "+ title);

        System.out.println("Current URL: "+driver.getCurrentUrl());

//        System.out.println("Page Source: "+driver.getPageSource());

        driver.navigate().to("http://google.com");

        Thread.sleep(5000);

        driver.close();
    }
}
