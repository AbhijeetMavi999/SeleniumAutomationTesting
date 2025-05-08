package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathAxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();

        // Self - select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/self::a")).getText();
        System.out.println("Self: "+text);

        // Parent - select the parent of the current node (always one)
        text = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/parent::td")).getText();
        System.out.println("Parent: "+text);

        // Child - selects all children of the current node (One or many)
        List<WebElement> children = driver.findElements(By.xpath("//a[contains(text(), 'L&T')]/ancestor::tr/child::td"));
        System.out.println("Number of Child elements: "+children.size());

        // Ancestor - selects all ancestors (parent, grandparent, etc.)
        text = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/ancestor::tr")).getText();
        System.out.println("Ancestor: "+text);

        // Descendant - selects all descendants (children, grandchildren, etc) of the current node
//        List<WebElement> descendants = driver.findElements(By.xpath(""))
    }
}
