package mouse.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        WebElement washington = driver.findElement(By.xpath("//div[@id='dropContent']//div[@id='box3']"));
        WebElement unitedStates = driver.findElement(By.xpath("//div[@id='box103']"));

        // Drag and Drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(washington, unitedStates).build().perform();
    }
}
