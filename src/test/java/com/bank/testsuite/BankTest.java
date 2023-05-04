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
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccountButton();
        openAccountPage.selectCustomerDropdown("6");
        openAccountPage.selectCurrencyDropdown("Pound");
        openAccountPage.clickProcessButton();
        Assert.assertTrue(getTextFromAlert().contains("Account created successfully"),"Text is not matching");
        acceptAlert();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
    homePage.clickOnCustomerLogin();
    customerLoginPage.selectYourNameDropDown("6");
    customerLoginPage.clickOnLogin();
    Assert.assertTrue(customerLoginPage.getTextTopTabs().contains("Logout"),"Logout Tab is not displayed");
    customersPage.clickOnLogout();
    Assert.assertTrue(customerLoginPage.verifyYourNameTExt().contains("Your Name"), "Field does not contain Your Name");


    }


    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectYourNameDropDown("6");
        customerLoginPage.clickOnLogin();
        customersPage.clickOnDeposit();
        customersPage.enterAmountToBeDeposited("100");
        customersPage.clickOnDepositSubmitButton();
       Assert.assertTrue(accountPage.verifyTextDepositSuccessful().contains("Deposit Successful"),"Text is not verified");


    }

@Test
    public void customerShouldWithdrawMoneySuccessfully(){
    homePage.clickOnCustomerLogin();
    customerLoginPage.selectYourNameDropDown("6");
    customerLoginPage.clickOnLogin();
    customersPage.clickOnWithdrawl();
    customersPage.enterAmountToBeWithdrawn("50");
    customersPage.clickOnWithdraw();
    accountPage.verifyTextTransactionSuccessful();

    }
}
