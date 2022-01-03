package com.opencart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseClass {
    public static void main(String[] args) {
        firefox_launch();
        open_URL("https://demo.opencart.com/index.php?route=account/login");
        TC_Login_001();
    }

    public static void TC_Login_001(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(TestEamil);

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("@#&saiful797");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();

    }


}
