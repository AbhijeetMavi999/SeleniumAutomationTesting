package tabs.and.windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");

        // This si available in Selenium 4.xx and above version
        driver.switchTo().newWindow(WindowType.TAB);
//        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://orangehrm.com/");
    }
}
