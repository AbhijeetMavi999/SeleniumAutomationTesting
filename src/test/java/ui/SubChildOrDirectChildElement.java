package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubChildOrDirectChildElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.salesforce.com/form/developer-signup/?d=pb");
        driver.findElement(By.cssSelector("select[name='CompanyCountry'] > option[value='RO']"))
                .sendKeys("RO");
        driver.manage().window().maximize();
    }
}
