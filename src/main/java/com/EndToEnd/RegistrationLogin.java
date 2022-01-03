package com.EndToEnd;

import com.Base.BaseClass;
import com.opencart.LoginTest;
import com.opencart.Registration;

public class RegistrationLogin extends BaseClass{
    public static void main(String[] args) {
        chrome_launch();
        open_URL("https://demo.opencart.com/");
        Registration.TC_Registration_001();

        open_URL("https://demo.opencart.com/index.php?route=account/login");
        LoginTest.TC_Login_001();
    }
}
