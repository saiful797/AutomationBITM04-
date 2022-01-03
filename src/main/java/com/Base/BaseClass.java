package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    public static WebDriver driver;
    public static String TestEamil="saifulsaifmithu@gmail.com";

    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static void firefox_close(){
        driver.close();
    }

    public static void chrome_close(){
        driver.close();
    }

    public static void open_URL(String URL){
        driver.get(URL);
    }
}
