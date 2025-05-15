package test.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com");
        driver.manage().window().maximize();

        // Choose the departure city
        WebElement departureCities = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select sltDepartureCities = new Select(departureCities);
        sltDepartureCities.selectByVisibleText("Portland");

        // Choose the destination city
        WebElement destinationCities = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select sltDestinationCities = new Select(destinationCities);
        sltDestinationCities.selectByVisibleText("New York");

        // Click on the Find Flights
        driver.findElement(By.xpath("//input[@type='submit' and @value='Find Flights']")).click();

        // find the total number of rows
        int rows = driver.findElements(By.xpath("//tbody/tr")).size();

        // finding the lowest price for flight
        float lowestPrice = Float.MAX_VALUE;
        for(int i=1; i<=rows; i++) {
            String price = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]")).getText();
            price = price.replace("$", "");
            float fltPrice = Float.parseFloat(price);
            if(fltPrice < lowestPrice) {
                lowestPrice = fltPrice;
            }
        }

        // Selecting the flight which has lowerPrice
        for(int i=1; i<=rows; i++) {
            String price = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]")).getText();
            price = price.replace("$", "");
            float fltPrice = Float.parseFloat(price);
            if(fltPrice == lowestPrice) {
                driver.findElement(By.xpath("//tbody//tr["+i+"]/td[1]//input")).click();
                break;
            }
        }

        // Filling the details of passenger
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Abhijeet");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("IT-Area");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chandigarh");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Haryana");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("256155");
        WebElement element = driver.findElement(By.xpath("//select[@id='cardType']"));
        Select sltElement = new Select(element);
        sltElement.selectByVisibleText("American Express");
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("2597365926525742");
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2026");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Mavi");
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//input[@type='submit' and @value='Purchase Flight']")).click();

        // Validating the response text
        String message = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).getText();
        if(message.contains("Thank you for your purchase")) {
            System.out.println("Success! Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
