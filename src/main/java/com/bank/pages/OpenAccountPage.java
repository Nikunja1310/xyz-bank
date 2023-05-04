package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {


    By selectCustomerLink = By.linkText("---Customer Name---");
    By customerDropDownLink = By.xpath("//select[@name='userSelect']/option");
    By currencyDropDownLink = By.xpath("//select[@id='currency']/option");
    By processLink = By.xpath("//button[@type='submit']");




    public void selectCustomerDropdown(String value){
        selectByValueFromDropDown(customerDropDownLink,value);
    }

    public void selectCurrencyDropdown(String currency){
        selectByVisibleTextFromDropDown(currencyDropDownLink,currency);
    }

    public void clickProcessButton(){
        clickOnElement(processLink);
    }
}
