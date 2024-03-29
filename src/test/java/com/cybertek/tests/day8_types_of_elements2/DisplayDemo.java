package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.tests.da2_webdriver_basic.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemo {

    @Test
    public void test1() {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
            WebElement usernameInput = driver.findElement(By.id("username"));
            //isDisplayed()--> if the element is in the html code, but not displayed
            //it will return false, if displayed it will return true.
            System.out.println(usernameInput.isDisplayed());
            Assert.assertFalse(usernameInput.isDisplayed(), "Verify that username inputbox is not displayed");
            WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
            startButton.click();

            System.out.println(usernameInput.isDisplayed());
            Assert.assertTrue(usernameInput.isDisplayed());


        }

    }
