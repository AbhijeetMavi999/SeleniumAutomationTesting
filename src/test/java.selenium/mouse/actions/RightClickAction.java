package mouse.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions actions = new Actions(driver);

        // Right click action
        actions.contextClick(button).build().perform();

        // Click on copy
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

        // close alert box
        driver.switchTo().alert().accept();
    }
}
