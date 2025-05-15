package test.file.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // Single file upload
//        driver.findElement(By.xpath("//input[@id='filesToUpload']"))
//                .sendKeys("C:\\Users\\Abhijeet Mavi\\Downloads\\AI Generated Image 1.png");
//
//        if(driver.findElement(By.xpath("//ul[@id='fileList']//li"))
//                .getText().equals("AI Generated Image 1.png")) {
//            System.out.println("File upload successfully!");
//        } else {
//            System.out.println("File upload failed...");
//        }

        // Upload multiple file
        String file1 = "C:\\Users\\Abhijeet Mavi\\Downloads\\AI Generated Image 1.png";
        String file2 = "C:\\Users\\Abhijeet Mavi\\Downloads\\AI Generated Image 2.png";
        driver.findElement(By.xpath("//input[@id='filesToUpload']"))
                .sendKeys(file1 + "\n" + file2);
        boolean isFile1Upload = driver.findElement(By.xpath("//ul[@id='fileList']//li[1]"))
                .getText().equals("AI Generated Image 1.png");
        boolean isFile2Upload = driver.findElement(By.xpath("//ul[@id='fileList']//li[2]"))
                .getText().equals("AI Generated Image 2.png");

        if(isFile1Upload && isFile2Upload) {
            System.out.println("Files uploaded successfully!");
        } else {
            System.out.println("Files upload failed...");
        }
    }
}
