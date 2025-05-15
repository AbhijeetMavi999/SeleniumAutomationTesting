package test.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *  2 types of xPath
 *  1. Absolute xPath (full xpath)
 *  2. Relative xPath (partial xpath)
 */

public class XPathLocator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        // Absolute xpath

//        driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("T-Shirts");

        // using multiple attribute
//        driver.findElement(By.xpath("//input[@name='q'][@placeholder=\'Search store']"))
//                .sendKeys("Laptop");

        // We can also use and/or in xpath


        // xpath with inner text
//        driver.findElement(By.xpath("//a[text()='Desktops ']")).click();


        // Capturing text from a dashboard
//        boolean isDisplayed = driver.findElement(By.xpath("//strong[text()= 'Featured products']")).isDisplayed();
//        System.out.println(isDisplayed);

        // contains() function

        // starts-with() function

        // chained xpath
//        driver.get("https://demo.opencart.com/");
//        System.out.println(driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed());
    }
}

