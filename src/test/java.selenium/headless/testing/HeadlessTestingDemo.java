package headless.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingDemo {
    public static void main(String[] args) {

        // Setting for headless mode of execution
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        if(title.equals("Automation Testing Practice")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
