package mouse.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        // Switch to iFrame
        driver.switchTo().frame("iframeResult");

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        box1.clear();
        box1.sendKeys("Welcome!");

        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        // Double click action on the button
        Actions actions = new Actions(driver);
        actions.doubleClick(button).build().perform();

        // validation: box2 should contain Welcome text as box1
        String text = box2.getAttribute("value");
        System.out.println(text.equals("Welcome!") ? "Text copied successfully!" : "Text not copied properly..");
    }
}