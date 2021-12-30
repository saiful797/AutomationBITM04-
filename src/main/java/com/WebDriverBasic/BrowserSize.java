package com.WebDriverBasic;

import org.openqa.selenium.Dimension;

public class BrowserSize extends Browser{
    public static void main(String[] args) {
        //chrome_launch();
        firefox_launch();
        get_browser_maximize_size();
        //chrome_close();
        //firefox_close();
        ipad();
    }

    public static void get_browser_maximize_size(){
        int hight= driver.manage().window().getSize().height;
        int width= driver.manage().window().getSize().width;
        System.out.println("Width: "+width+"  Hight: "+hight);
    }
    public static void ipad(){
        driver.manage().window().setSize(new Dimension(768,1024));
        int hight= driver.manage().window().getSize().height;
        int width= driver.manage().window().getSize().width;
        System.out.println("ipad Width: "+width+"  ipad Hight: "+hight);
    }
}
