package keyboard.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OpenLinkInNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement registerLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        Actions actions = new Actions(driver);

        // Open link in new tab
        actions.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).build().perform();

        // Switching the registration page
        List<String> windowIDs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowIDs.get(1));

        // set firstname in registration page
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Cena");

        // switch back to homepage
        driver.switchTo().window(windowIDs.get(0));
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Laptops");
    }
}
