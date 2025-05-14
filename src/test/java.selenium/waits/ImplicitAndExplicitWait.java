package test.java.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitAndExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//        driver.close();

        // explicit wait
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");
        WebElement password = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Password']")));
        password.sendKeys("admin123");
        WebElement loginButton = explicitWait.until(ExpectedConditions.elementToBeClickable(
           By.xpath("//button[@type='submit']")));
        loginButton.click();


        driver.close();


        // Implicit Wait = It is a global wait time applied to all elements in the test. It tells selenium to wait for a certain
        // amount of time before throwing an exception if an element is not immediately available.

        // Explicit Wait = It is more specific wait that applies only to a particular element. It waits until a certain condition
        // is met (like visibility, clickability, etc) before continuing with the next step.
    }
}
