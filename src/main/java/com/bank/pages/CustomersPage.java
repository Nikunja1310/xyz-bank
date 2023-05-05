package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By logoutButton=By.xpath("//button[@class='btn logout']");

       By depositLink = By.xpath("//button[normalize-space()='Deposit']");

    By withdrawlLink = By.xpath("//button[normalize-space()='Withdrawl']");





    public void clickOnLogout(){
        clickOnElement(logoutButton);
    }
    public void clickOnDeposit(){
        clickOnElement(depositLink);
    }




    public void clickOnWithdrawl(){
        clickOnElement(withdrawlLink);
    }



    public boolean verifyThatLogoutIsDisplayed(){
        boolean button=driver.findElement(logoutButton).isDisplayed();
        if (button) {
            return true;
        } else {
            return false;
        }
    }



}
