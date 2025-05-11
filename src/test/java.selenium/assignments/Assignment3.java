package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();

        WebElement options = driver.findElement(By.xpath("//*[@id='country-list']"));
        Select drpCountry = new Select(options);

        List<WebElement> drpCountries = drpCountry.getOptions();
        System.out.println("Total number of options in dropdowns: "+drpCountries.size());

        // Printing all the options
        for(WebElement option: drpCountries) {
            System.out.print(option.getText()+", ");
        }

        // Select one option
        drpCountry.selectByVisibleText("India");
    }
}
