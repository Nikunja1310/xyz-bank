package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {


    By yourNameLink = By.xpath("//select[@id='userSelect']/option");
    By loginLink = By.xpath("//button[@type='submit']");
    public By topTabs = By.xpath("//div[@class='box mainhdr']/button");

    By yourName = By.xpath("//label[normalize-space()='Your Name :']");



    public void selectYourNameDropDown(String value){
        selectByValueFromDropDown(yourNameLink,value);
    }

    public void clickOnLogin(){
        clickOnElement(loginLink);
    }

    public String getTextTopTabs(){
        return getTextFromElement(topTabs);
    }

    public String verifyYourNameTExt(){
        return getTextFromElement(yourNameLink);
    }



}
