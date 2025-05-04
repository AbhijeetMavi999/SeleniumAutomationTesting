package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleBootstrapDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();   // open dropdown option

        // select single option
        driver.findElement(By.xpath("//input[@value='Java']")).click();

        // Capture all the options and find out the size
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]/li/a/label"));
        System.out.println("Number of options in dropdown: "+options.size());
        for(WebElement option: options) {
            System.out.print(option.getText()+", ");
        }
    }
}
