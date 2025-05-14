package test.java.selenium.mouse.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        WebElement notebooks = driver.findElement(By.xpath("//ul[@class='sublist first-level']/li[2]/a"));

        Actions actions = new Actions(driver);

        // Mouse hover
        actions.moveToElement(computers).moveToElement(notebooks).click().build().perform();

        // build() = Create an action
        // perform() = Complete an action
    }
}