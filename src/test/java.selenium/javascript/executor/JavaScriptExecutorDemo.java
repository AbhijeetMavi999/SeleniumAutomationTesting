package javascript.executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {
        // In some cases sendKeys() will not work and throw ElementInterceptedException. So, In that case we can use
        // JavaScriptExecutor to send values in text boxes.

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//input[@id='name']"));

        // This is the alternate of sendKeys() method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'John Cena')", element);

        WebElement radioBtn = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radioBtn);
    }
}
