package com.WebDriverBasic;

public class WebsiteLaunch extends Browser{
    public static void main(String[] args) {
        chrome_launch();
        open_Offline_URL();
        open_URL();
        chrome_close();


    }
    public static void open_URL(){
        driver.get("https://google.com");
        //driver.manage().window().maximize();
    }

    public static void open_Offline_URL(){
        driver.get("file:///D:/Softwire Testing Class/Demo Opencart/Your Store.html");
    }
}
