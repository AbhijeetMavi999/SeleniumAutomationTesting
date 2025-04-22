package basicmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BasicWebDriverMethods2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

//        driver.get("https://saucedemo.com/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        List<WebElement> listElements = driver.findElements(By.xpath("//*[@class='inventory_list']/div"));
        System.out.println("List of Elements: "+listElements);

        driver.get("https://www.sugarcrm.com/");
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Handle: "+windowHandle);

        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[5]/div/div/div/div[2]/div/div[1]/span[1]/a/img"))
                .click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: "+windowHandles);

        Thread.sleep(3000);
        driver.close();
    }
}
