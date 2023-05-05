package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {


    By yourNameLink = By.xpath("//select[@id='userSelect']");
    By loginLink = By.xpath("//button[@type='submit']");
    By yourNameText = By.xpath("//label[normalize-space()='Your Name :']");

    public void selectYourNameDropDown(String value){
       selectByVisibleTextFromDropDown(yourNameLink,value);
    }

    public void clickOnLogin(){
        clickOnElement(loginLink);
    }

    public String verifyYourNameTExt(){
        return getTextFromElement(yourNameText);
    }
}
