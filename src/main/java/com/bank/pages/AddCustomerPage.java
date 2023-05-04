package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");


    public void enterFirstName(String value){
        sendTextToElement(firstNameField,value);
    }

    public void enterLastName(String value){
        sendTextToElement(lastName,value);
    }

    public void enterPostCode(String value){
        sendTextToElement(postCode,value);
    }

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }

    public String getTextForCustomerAddedSuccessfullyFromAlert(){
        return getTextFromAlert();
    }
}
