package com.calculator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{

    @Test
    public void addShouldSucceed() throws InterruptedException {
        Thread.sleep(3000);

        driver.findElement(By.id("digit5")).isDisplayed();
        driver.findElement(By.id("digit5")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("plus")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("digit7")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("equal")).click();
        Thread.sleep(3000);

    }
}
