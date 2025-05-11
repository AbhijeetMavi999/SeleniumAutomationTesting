package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

/*
1. Link     href="https://xyz.com"
2. https://xyz.com  --->    server  --->    status code
3. status code >= 400   --->    broken links
    status code < 400   --->    not a broken links
*/

public class BrokenLinksDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        // Capture all the links from website
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: "+links.size());

        int noOfBrokenLinks = 0;
        for(WebElement link: links) {
            String hrefAttributeValue = link.getAttribute("href");
            if(hrefAttributeValue != null && !hrefAttributeValue.isEmpty()) {
                try {
                    URL urlLink = new URL(hrefAttributeValue);  // converted href value from String to URL format
                    HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();    // open connection to the server
                    connection.connect();   // connect to server and sent request the server

                    if(connection.getResponseCode() >= 400) {
                        System.out.println(hrefAttributeValue+" ===> Broken link");
                        noOfBrokenLinks++;
                    } else {
                        System.out.println(hrefAttributeValue+" ===> Not a broken link");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Total number of broken links: "+noOfBrokenLinks);
    }
}
