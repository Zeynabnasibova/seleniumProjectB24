package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/maps");

        driver.manage().window().maximize();


        WebElement search = driver.findElement(By.xpath("(//*[@class='tactile-searchbox-input'])[1]"));
        search.sendKeys("Fairfax"+ Keys.ENTER);

        Thread.sleep(4000);
        WebElement drections = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div/div/div/div/div/div/div[4]/div/button/span"));

        drections.click();


    }


}
