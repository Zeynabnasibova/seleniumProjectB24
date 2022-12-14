package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapsXpathTest {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        String url = "https://www.google.com/maps";
//        driver.get(url);
//        //search for cybertek school
//        WebElement addressField = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/form/div/div[3]/div/input[1]"));
//        addressField.sendKeys("cybertek school" + Keys.ENTER);
//
//        Thread.sleep(4000);
//
//        //click on directions
//        WebElement directions = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[8]/div/div[1]/div/div/div[4]/div[1]/button/span/img"));
//        directions.click();
//
//        Thread.sleep(2000);
//
//        WebElement startingAddressField = driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"));
//        startingAddressField.sendKeys("8104 amethyst dr, Mclean VA" + Keys.ENTER);
//
//        driver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/maps");

        driver.manage().window().maximize();

//search for Fairfax
        WebElement search = driver.findElement(By.xpath("(//*[@class='tactile-searchbox-input'])[1]"));
        search.sendKeys("Fairfax"+ Keys.ENTER);


        Thread.sleep(4000);
        WebElement drections = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[9]/div/div/div/div/div/div/div/div/div[4]/div/button/span"));

        drections.click();


    }
}