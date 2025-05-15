package test.keyboard.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("inputText1")).sendKeys("Welcome!");
        Actions actions = new Actions(driver);

        // Ctrl + A = Select the text
        actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();

        // Ctrl + C = Copy the text
        actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();

        // Tab = Shift to 2nd text box
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();

        // Ctrl + V = Paste the text
        actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
    }
}
