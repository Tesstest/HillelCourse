package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium{
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Work\\DriversTools\\chromedriver\\chromedriver_win32_v2_35\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.yahoo.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement textBox = driver.findElement(By.id("uh-search-box"));
        WebElement searchButton = driver.findElement(By.id("uh-search-button"));

        textBox.sendKeys("Zoox");
        searchButton.click();


    }

}

