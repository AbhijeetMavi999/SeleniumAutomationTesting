package test.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        // isDisplayed = check if the element is visible
        boolean isDisplayed = driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
        System.out.println("Status of logo: "+isDisplayed);

        // isEnabled() - check if the element is interactive
        // mostly used for input boxes, dropdowns.
        boolean status = driver.findElement(By.xpath("//*[@id='FirstName']")).isEnabled();
        System.out.println("Enable status: "+status);

        // isSelected() - check if the element is selected for checkboxes or radio buttons
        WebElement webElement = driver.findElement(By.xpath("//*[@id='gender-male']"));
        // Before selection
        System.out.println("Before Selection: "+webElement.isSelected());
        // After selection
        webElement.click();
        System.out.println("After Selection: "+webElement.isSelected());
    }
}
