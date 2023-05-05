package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By amountToBeDeposited = By.xpath("//input[@placeholder='amount']");
    By submitDeposit = By.xpath("//button[@type='submit']");

    By depositSuccessfulText = By.xpath("//span[@class='error ng-binding']");

    By transactionSuccessfulText = By.xpath("//span[@class='error ng-binding']");
    By amountToBeWithdrawn =By.xpath("//input[@placeholder='amount']");
    By withdrawButton = By.xpath("//button[@type='submit']");




    public void enterAmountToBeDeposited(String value){
        sendTextToElement(amountToBeDeposited,value);
    }

    public void clickOnDepositSubmitButton(){
        clickOnElement(submitDeposit);
    }
    public String verifyTextDepositSuccessful() {
        return getTextFromElement(depositSuccessfulText);
    }

    public String verifyTextTransactionSuccessful(){
        return getTextFromElement(transactionSuccessfulText);
    }

    public void enterAmountToBeWithdrawn(String amount){
        sendTextToElement(amountToBeWithdrawn,amount);
    }

    public void clickOnWithdraw(){
        clickOnElement(withdrawButton);
    }
}
