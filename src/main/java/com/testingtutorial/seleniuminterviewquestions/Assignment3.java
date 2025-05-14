package com.testingtutorial.seleniuminterviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.get("https://www.amazon.in/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
