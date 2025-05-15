package test.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='product_551']")).click();
        driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Cena");
        driver.findElement(By.xpath("//textarea[@id='order_comments']"))
                .sendKeys("I'd like to order chilli potato");
        // click on dob
        driver.findElement(By.xpath("//input[@id='dob']")).click();

        // select the dob
        WebElement months = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sltMonths = new Select(months);
        sltMonths.selectByVisibleText("Apr");

        WebElement years = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sltYears = new Select(years);
        sltYears.selectByVisibleText("1977");

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for(WebElement date: dates) {
            if(date.getText().equals("23")) {
                date.click();
            }
        }

        driver.findElement(By.xpath("//input[@id='sex_1']")).click();
        driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Delhi");
        driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Chandigarh");

        // departure date
        driver.findElement(By.id("departon")).click();
        WebElement departureMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sltDepartureMonth = new Select(departureMonth);
        sltDepartureMonth.selectByVisibleText("Oct");
        WebElement departureYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sltDepartureYear = new Select(departureYear);
        sltDepartureYear.selectByVisibleText("2025");
        List<WebElement> departureDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for(WebElement date: departureDates) {
            if(date.getText().equals("17")) {
                date.click();
            }
        }

        driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
        List<WebElement> purposeOfTicket = driver.findElements(By.xpath("//ul[@id='select2-reasondummy-results']"));
        for(WebElement ticket: purposeOfTicket) {
            if(ticket.getText().equals("Office work place needs it")) {
                ticket.click();
            }
        }
        driver.findElement(By.xpath("//input[@name='deliverymethod' and @value='2']")).click();
        driver.findElement(By.id("billing_phone")).sendKeys("9236592645");
        driver.findElement(By.id("billing_email")).sendKeys("johncena27389@gmail.com");
        driver.findElement(By.id("select2-billing_country-container")).click();
        List<WebElement> listOfCountries = driver.findElements(By.xpath("//ul[@id='select2-billing_country-results']/li"));
        for(WebElement country: listOfCountries) {
            if(country.getText().equals("United States (US)")) {
                country.click();
            }
        }

        // Address
        driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Sector 69, California (US)");
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("San francisco");
        driver.findElement(By.xpath("//span[@id='select2-billing_state-container']//span")).click();
        List<WebElement> states = driver.findElements(By.xpath("//ul[@id='select2-billing_state-results']//li"));
        for(WebElement state: states) {
            if(state.getText().equals("California")) {
                state.click();
                break;
            }
        }
        driver.findElement(By.id("billing_postcode")).sendKeys("329843");
        driver.findElement(By.id("place_order")).click();
    }
}
