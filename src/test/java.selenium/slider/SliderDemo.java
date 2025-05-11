package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI//");
        driver.manage().window().maximize();

        // For horizontal slider we have to change x value
        // For vertical slider we have to change y value

        // Min Slider
//        WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
//        System.out.println("Default location of the min slider: "+minSlider.getLocation());     // (59, 257) = (x, y)
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(minSlider, 100, 257).build().perform();
//        System.out.println("After moving location of min slider: "+minSlider.getLocation());    // (162, 257)

        // Max Slider
        WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("Default location of the max slider: "+maxSlider.getLocation());     // (575, 250)
        Actions actions1 = new Actions(driver);
        actions1.dragAndDropBy(maxSlider, -80, 250).build().perform();
        System.out.println("After moving location of max slider: "+maxSlider.getLocation());
    }
}
