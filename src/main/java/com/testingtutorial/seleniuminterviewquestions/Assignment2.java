package com.testingtutorial.seleniuminterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        boolean isDisplayed = driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
        System.out.println("Is displayed? "+isDisplayed);

        boolean isEnabled = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).isEnabled();
        System.out.println("Is enabled? "+isEnabled);

        WebElement element = driver.findElement(By.xpath("//input[@id='male']"));
        element.click();
        boolean isSelected = element.isSelected();
        System.out.println("Is selected? "+isSelected);
    }
}
