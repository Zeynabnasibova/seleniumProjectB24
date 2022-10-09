package com.cybertek.tests.day07_findElements;


import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForgotPassWordFindElements {
    public static void main(String[] args) {
        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);
        //find all links and store into list of webelements
        List<WebElement> list = driver.findElements(By.tagName("a"));

        //print count of link:
        System.out.println(list.size());

        //print text of first one
        System.out.println(list.get(0).getText());

        //print text of second one

        System.out.println( list.get(1).getText());
        //Loop and print href value of each one

        for(WebElement eachList : list){
            System.out.println(eachList.getAttribute("href"));
        }
        //iter -> enter or tab


        //click on Home link at index 1


    }
}