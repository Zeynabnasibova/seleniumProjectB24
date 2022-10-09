package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelsRegistrationTest {
    /*
    Php Travels Registration Test: - Try to use Variables for storing all data like url, first last names, email etc
- WebElement object variables for each element
- Locators: use your best judgement and mix it up, apply id, name, xpath etc

1. Add a new class PhpTravelsRegistrationTest

2. Navigate to https://www.phptravels.net

3. Click on Signup link on top

 4. Fill out all the information in the form and click on Signup:
Please ignore ‘Account type’ drop down

5. Verify the title is “Login - PHPTRAVELS”

6. Enter same login information that you used during registration and click login:
 7. Verify the welcome message contains the first name that you used during
registration then close the browser:
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.phptravels.net");
        //""
        WebElement accountBth = driver.findElement(By.xpath("(//button[@id='ACCOUNT'])[1]"));
        accountBth.click();
        //(//button[@id='ACCOUNT'])[1]

        WebElement signupBtn = driver.findElement(By.xpath("(//a[text()='Customer Signup'])[1]"));
        signupBtn.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));

        firstName.sendKeys("Zeynab");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Nasibova");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("87896787070");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("gfdhgfhf@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("fffhgjhgvhjjv");

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeAsyncScript("javascript:window.scroll(250,350)");
        Thread.sleep(2000);
     //   driver.findElement()
//        WebElement customer = driver.findElement(By.xpath("//select[@id='account_type']"));
//        Select customerElement = new Select(customer);
//        customerElement.selectByVisibleText("Customer");

//        WebElement login = driver.findElement(By.xpath("//a[@type='submit']"));
//        login.click();
    }
}
