package test.shadow.dom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        //This Element is inside single shadow DOM.
//        String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
//        Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("Rich Dad Poor Dad");

    }
}
