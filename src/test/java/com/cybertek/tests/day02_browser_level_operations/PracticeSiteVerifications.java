package com.cybertek.tests.day02_browser_level_operations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
    /*
TC #2: Cybertek practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cybertekschool.com
3. Verify URL contains
Expected: cybertekschool
4. Verify title:
       Expected: Practice
 */


    public class PracticeSiteVerifications {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
          //  WebDriver driver = new ChromeDriver();


            //make browser full screen/maximize
           // driver.manage().window().maximize();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            WebDriver driver= new ChromeDriver(options);

            driver.get("http://practice.cybertekschool.com");

            String currentUrl = driver.getCurrentUrl();
            String title = driver.getTitle();

            if (currentUrl.contains("cybertekschool")) {
                System.out.println("PASS: Url verification success");
            } else {
                System.out.println("FAIL: Url verification failed");
            }

            if (title.equals("Practice")) {
                System.out.println("PASS: Title verification success");
            } else {
                System.out.println("FAIL: Title verification failed");
            }

          //  driver.quit();
        }

}