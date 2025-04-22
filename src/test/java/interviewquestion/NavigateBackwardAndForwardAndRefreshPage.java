package interviewquestion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackwardAndForwardAndRefreshPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        driver.get("https://www.amazon.com/");

        driver.navigate().back(); // go back to snapdeal.com
        Thread.sleep(3000);
        driver.navigate().forward(); // came back to amazon.com

        driver.navigate().refresh(); // reload the page
    }
}
