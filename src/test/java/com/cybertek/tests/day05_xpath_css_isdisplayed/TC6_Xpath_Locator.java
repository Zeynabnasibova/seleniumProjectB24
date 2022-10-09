package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class TC6_Xpath_Locator {
    /*

TC #6:  XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”

USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/multiple_buttons");

        WebElement btn1 = driver.findElement(By.xpath("//button[text()='Button 1']"));
        btn1.click();

        WebElement textOfResult = driver.findElement(By.xpath("//p[text()='Clicked on button one!']"));
        System.out.println(textOfResult.getText());
        System.out.println(textOfResult.getAttribute("id"));
String expectedText = "Clicked on button one!";
String actualText = textOfResult.getText();
if (actualText.equals(expectedText)){
    System.out.println("Test PASS");
}else{
    System.out.println("Test FAIL");
}
    }
}
