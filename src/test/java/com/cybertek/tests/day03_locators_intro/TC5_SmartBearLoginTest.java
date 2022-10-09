package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #5: Basic login authentication
1- Open a chrome browser
2- Go to:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3- Verify title equals:
Expected: Web Orders Login
4- Enter username: Tester
5- Enter password: test
6- Click “Sign In” button
7- Verify title equals:
Expected: Web Orders
  */
public class TC5_SmartBearLoginTest {
    public static void main(String[] args) throws InterruptedException {
        String appUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        String userName = "Tester";
        String password = "test";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(appUrl);

        //enter userName
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        //enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);

        Thread.sleep(2000);
        //click login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //verify title is "Web Orders"
        Thread.sleep(2000);
        String expTitle = "Web Orders"; //required title from documentation
        String actTitle = driver.getTitle(); //actual coming from selenium browser

        if (actTitle.equals(expTitle)) { //compare if both match or no
            System.out.println("PASS: login success. title match");
        } else {
            System.out.println("FAIL: login failed. title mismatch");
        }
        //check title without variables
        if(driver.getTitle().equals("Web Orders")) {
            System.out.println("PASS: login success. title match");
        } else {
            System.out.println("FAIL: login failed. title mismatch");
        }

        //click logout link
        driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(2000);

        //quit browser
        driver.quit();


    }
}