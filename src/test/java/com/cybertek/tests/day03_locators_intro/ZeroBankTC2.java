package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  TC #2: Zero Bank link text verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify link text from top left:
Expected: “Zero Bank”
4. Verify link href attribute value contains:
Expected: “index.html”
• Create new class for each task.
• There are some tips in the 2nd page for whoever needs it.
• Please try to solve yourself first before moving to the tips.
   */
public class ZeroBankTC2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String appUrl = "http://zero.webappsecurity.com/login.html";
        driver.get(appUrl);

        String textOfLink = driver.findElement(By.className("brand")).getText();
        System.out.println("textOfLink = " + textOfLink);

        if (textOfLink.equals("Zero Bank")) {
            System.out.println("PASS: link text matched");
        } else {
            System.out.println("FAIL: link text mismatched");
        }

        String href = driver.findElement(By.className("brand")).getAttribute("href");
        System.out.println("href = " + href);

        driver.quit();

    }
}