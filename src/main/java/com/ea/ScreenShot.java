package com.ea;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenShot {
    static void main() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.get("https://www.sarkariresult.com/");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        File destFile = new File("F:\\Pankaj Vishwakarma\\Udemy Automation\\AutomationPrograms\\SS\\screenshot.png");
        Files.copy(srcFile.toPath(), destFile.toPath());
        Thread.sleep(5000);
        driver.close();
    }
}
