package com.bank.testsuite;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BankTest extends BaseTest {
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
    homePage.clickOnBankManagerLogin();
    bankManagerLoginPage.clickOnAddCustomerLink();
    addCustomerPage.enterFirstName("Nirali");
    addCustomerPage.enterLastName("Sen");
    addCustomerPage.enterPostCode("3084");
    addCustomerPage.clickOnAddCustomerButton();
    Assert.assertTrue(addCustomerPage.getTextForCustomerAddedSuccessfullyFromAlert().contains("Customer added successfully"),"Text not matching");
    acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnHome();
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccountButton();
        openAccountPage.selectCustomerDropdown("Nirali Sen");
        openAccountPage.selectCurrencyDropdown("Pound");
        openAccountPage.clickProcessButton();
        Assert.assertTrue(getTextFromAlert().contains("Account created successfully"),"Text is not matching");
        acceptAlert();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){homePage.clickOnHome();
    homePage.clickOnCustomerLogin();
    customerLoginPage.selectYourNameDropDown("Nirali Sen");
    customerLoginPage.clickOnLogin();
   customersPage.verifyThatLogoutIsDisplayed();
    customersPage.clickOnLogout();
    Assert.assertTrue(customerLoginPage.verifyYourNameTExt().contains("Your Name"), "Field does not contain Your Name");

    }


    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnHome();
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectYourNameDropDown("Nirali Sen");
        customerLoginPage.clickOnLogin();
        customersPage.clickOnDeposit();
        accountPage.enterAmountToBeDeposited("100");
        accountPage.clickOnDepositSubmitButton();
       Assert.assertTrue(accountPage.verifyTextDepositSuccessful().contains("Deposit Successful"),"Text is not verified");


    }

@Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnHome();
    homePage.clickOnCustomerLogin();
    customerLoginPage.selectYourNameDropDown("Nirali Sen");
    customerLoginPage.clickOnLogin();
    customersPage.clickOnWithdrawl();
    accountPage.enterAmountToBeWithdrawn("50");
    accountPage.clickOnWithdraw();
    accountPage.verifyTextTransactionSuccessful();

    }
}
