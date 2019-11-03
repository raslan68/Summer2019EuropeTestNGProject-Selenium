package com.cybertek.tests.day3_webelemt_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotChamged {

    /**
     * verify URL not changed
     * open chrome
     * go to http://practice.cybertekschool.com/forgot_password Link to an external site.
     * click on Retrieve password
     * verify that url did not changed

     */

    public static void main(String[] args) {

        //open the chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys()-->send keyboard actions to webelement / enters given text
        emailInput.sendKeys("email@gmail.com");
        //locate to password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //click button
        retrievePasswordButton.click();
        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        //verify that url changed to http://practice.cybertekschool.com/email_sent
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
        //close
        driver.quit();






    }
}
