package com.cybertek.tests.day05_xpath_css_isdisplayed;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
 */
public class P1_ForgotPassword_xpath_css {
    public static void main(String[] args) {

        String appUrl = "http://practice.cybertekschool.com/forgot_password";

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get(appUrl);

        //<a class="nav-link" href="/">Home</a>
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //<h2>Forgot Password</h2>
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        WebElement emailLabel = driver.findElement(By.xpath("//label[text()='E-mail']"));

        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']")) ;

        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//i[text()='Retrieve password']"));

        WebElement poweredByLabel = driver.findElement(By.xpath("//a[text()='CYDEO']")) ;

        System.out.println("homelink = " + homeLink.isDisplayed());

        System.out.println("forgotPasswordHeader = "+forgotPasswordHeader.isDisplayed());

        System.out.println("emailLabel = " + emailLabel.isDisplayed());

        System.out.println("emailField = " + emailField.isDisplayed());

        System.out.println("retrievePasswordBtn = " + retrievePasswordBtn.isDisplayed());

        System.out.println("poweredByLabel = " + poweredByLabel.isDisplayed());
    }
}