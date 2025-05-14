package com.testingtutorial.seleniuminterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement countries = driver.findElement(By.xpath("//select[@id='input-country']//option"));
        Select sltCountries = new Select(countries);
        List<WebElement> elements = sltCountries.getOptions();
        System.out.println("Total number of countries: "+elements.size());

        sltCountries.selectByVisibleText("Israel");
    }
}
