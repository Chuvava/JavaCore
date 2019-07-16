package com.interviewTasks.naveen._12_singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        DriverInit instanceDriver = DriverInit.getInstance();
        driver = instanceDriver.openBrowser();
        driver = instanceDriver.openBrowser();
    }

    @Test
    public void testMethod1(){
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
}
