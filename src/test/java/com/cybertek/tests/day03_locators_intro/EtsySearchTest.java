package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearchTest {
    /*
   EtsySearch
Create a class EtsySearchTest
Navigate to etsy homepage
Search for "wooden spoon"
Verify title starts with "wooden spoon"
Click on "Holiday Shop" link
Read the text of the Header using h1 tag
Verify the header equals "Holiday Shop"
Close the browser
    */
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        Thread.sleep(2000);
        WebElement etsySearBox = driver.findElement(By.xpath("//input[@data-id='search-query']"));
        Thread.sleep(2000);
        etsySearBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith("wooden spoon")){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }

    }
}
