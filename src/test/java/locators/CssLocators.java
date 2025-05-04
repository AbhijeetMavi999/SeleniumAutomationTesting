package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Using CSS Selector we can use 4 combination
 * 1. tag#id
 * 2. tag.className
 * 3. tag[attribute="value"]
 * 4. tag.className[attribute="value"]
 *
 *  tag is optional
 */

public class CssLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // tag, id
//        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Samsung Premium Ultrabook");

        // tag, className
//        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");

        // tag, attribute
//        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Samsung Premium Ultrabook");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // tag, className, and attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
    }
}
