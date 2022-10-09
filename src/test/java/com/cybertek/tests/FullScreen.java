package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FullScreen {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        //driver.manage().window().maximize();

        //If maximize() will NOT work, so I have a code for that :

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.com");

        String title = driver.getTitle();
        System.out.println("Current title: " + title);

        String url = driver.getCurrentUrl();

        System.out.println("url = " + url);

        WebElement shoes = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-none fluid-image-container'])[2]"));

        // second xpath //*[@href='https://www.amazon.com/s?i=fashion&bbn=19314805011&rh=n%3A7141123011%2Cn%3A19314805011%2Cn%3A7147441011%2Cn%3A679255011&s=date-desc-rank&ref_=Topcard_QuadCat_AF_July_SND_1_Shoes&pf_rd_r=GZ0NXNXG6XDAEEFGENP9&pf_rd_p=88bb663e-1a88-4e60-94bc-aceafebba485&pd_rd_r=862494b6-d1f8-4b43-82b9-9015a5d78383&pd_rd_w=5uKXB&pd_rd_wg=ublpx']

        Thread.sleep(2000);
        shoes.click();

        Thread.sleep(2000);
        String titleShoes = driver.getTitle();
        System.out.println("Current title: " + titleShoes);


    }
    }