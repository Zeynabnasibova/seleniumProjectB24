package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLoginTitleVerification {
        /*
    TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String username = "jjhkjj";
        String password = "kjgfd";
        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
        usernameInputBox.sendKeys(username);
        Thread.sleep(2000);
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordInputBox.sendKeys(password);
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
        loginBtn.click();
        Thread.sleep(2000);
        String actrualTitle = driver.getTitle();
        System.out.println(actrualTitle);
        String expectedTitle = "Log into Facebook";
        if(actrualTitle.equals(expectedTitle)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
            System.out.println("Expected title: " + expectedTitle);
            System.out.println("Actual Title: " + actrualTitle);
        }


    }
}
