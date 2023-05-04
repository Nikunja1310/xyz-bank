package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerLink = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccountLink = By.xpath("//button[normalize-space()='Open Account']");

    public void clickOnAddCustomerLink(){
        clickOnElement(addCustomerLink);
    }
    public void clickOnOpenAccountButton(){
        clickOnElement(openAccountLink);
    }
}


