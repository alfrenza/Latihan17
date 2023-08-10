package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    private WebDriver driver;

    public MyAccountPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

        //locator FindBy

        //Custom Method
    }
}
