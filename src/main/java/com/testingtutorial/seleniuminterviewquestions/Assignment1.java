package com.testingtutorial.seleniuminterviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        System.out.println("Title of the page: "+driver.getTitle());
        System.out.println("Current URL of the page: "+driver.getCurrentUrl());
        System.out.println("PageSource: "+driver.getPageSource());
    }
}
