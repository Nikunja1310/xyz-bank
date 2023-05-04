package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By depositSuccessfulText = By.xpath("//span[@class='error ng-binding']");

    By transactionSuccessfulText = By.xpath("//span[@class='error ng-binding']");


    public String verifyTextDepositSuccessful() {
        return getTextFromElement(depositSuccessfulText);
    }

    public String verifyTextTransactionSuccessful(){
        return getTextFromElement(transactionSuccessfulText);
    }
}
