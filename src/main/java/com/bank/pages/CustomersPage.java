package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {


    By logout = By.xpath("//button[@class='btn logout']");
    By depositLink = By.xpath("//button[normalize-space()='Deposit']");
    By amountToBeDeposited = By.xpath("//input[@placeholder='amount']");
    By submitDeposit = By.xpath("//button[@type='submit']");
    By withdrawlLink = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountToBeWithdrawn =By.xpath("//input[@placeholder='amount']");
    By withdrawButton = By.xpath("//button[@type='submit']");


    public void clickOnLogout(){
        clickOnElement(logout);
    }
    public void clickOnDeposit(){
        clickOnElement(depositLink);
    }
    public void enterAmountToBeDeposited(String value){
        sendTextToElement(amountToBeDeposited,value);
    }

    public void clickOnDepositSubmitButton(){
        clickOnElement(submitDeposit);
    }



    public void clickOnWithdrawl(){
        clickOnElement(withdrawlLink);
    }

    public void enterAmountToBeWithdrawn(String amount){
        sendTextToElement(amountToBeWithdrawn,amount);
    }

    public void clickOnWithdraw(){
        clickOnElement(withdrawButton);
    }
}
