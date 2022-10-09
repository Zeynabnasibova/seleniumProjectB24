package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHrefVerification {
    /*
TC #4: Facebook header verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify “Create a page” link href value contains text:
Expected: “registration_form”
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expected = "registration_form";
        String actual = driver.findElement(By.linkText("Create a Page")).getAttribute("href");
        System.out.println(actual);
        if(actual.contains(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
