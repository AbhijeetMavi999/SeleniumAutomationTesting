package test.javascript.executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1. Scroll down the page by pixel number
//        js.executeScript("window.scrollBy(0, 1500)", "");   // (x, y)
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        // 2. Scroll down the page till element is visible (Conditional Based)
//        WebElement element = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        // 3. Scroll down the page till the end of the page
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        // Scrolling up to initial position
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)", "");
    }
}
