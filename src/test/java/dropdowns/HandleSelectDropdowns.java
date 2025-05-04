package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
1. Select dropdown (old ways to create dropdown)
2. Bootstrap dropdown
3. Hidden dropdown
*/

public class HandleSelectDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // If there is a Select tag dropdown
        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);

//        drpCountry.selectByVisibleText("Japan");
//        drpCountry.selectByValue("japan");      // select using value attribute
        drpCountry.selectByIndex(2);

        // capture all options from the dropdown
        List<WebElement> options = drpCountry.getOptions();
        System.out.println("Number of options in dropdown: "+options.size());

        for(WebElement option: options) {
            System.out.print(option.getText()+", ");
        }
    }
}
