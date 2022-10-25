package com.calculator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AndroidDriver driver;



    @BeforeClass
    public void appiumSetup(){

        try {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("uid", "LHTDU16C03005729");
        capabilities.setCapability("platfaormVersion", "6");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        capabilities.setCapability("platformName", "Android");

            capabilities.setCapability("appium:platformName", MobilePlatform.ANDROID);


            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    @AfterClass
    public void tearDowm(){
        driver.quit();
    }



}
