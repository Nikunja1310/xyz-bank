package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginLink = By.xpath("//button[normalize-space()='Customer Login']");

    By homeLink = By.xpath("//button[contains(text(),'Home')]");

    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginLink);
    }

    public void clickOnCustomerLogin(){
        clickOnElement(customerLoginLink);
    }

    public void clickOnHome(){
        clickOnElement(homeLink);
    }

}

