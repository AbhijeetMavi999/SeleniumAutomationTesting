package com.testingtutorial.seleniuminterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login");
        driver.manage().window().maximize();

        // clear() and sendKeys()
        WebElement element = driver.findElement(By.id("Email"));
        element.sendKeys("xyz@gmail.com");
        Thread.sleep(3000);
        element.clear();
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("abc@gmail.com");

        // capture the text
        System.out.println("Email captured: "+element.getAttribute("value"));
    }
}
