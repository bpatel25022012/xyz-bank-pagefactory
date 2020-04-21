package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




/*
Created By Bhavesh
*/
public class BankTest extends TestBase {

    String firstName = null;
    String lastName = null;
    HomePage homePage;
    BankManagerLoginPage bml;
    AddCustomerPage ac;
    OpenAccountPage oap;
    CustomerLoginPage cl;
    AccountPage acc;
    CustomerPage  cp;

    @BeforeMethod(groups = {"regression"})
    public void setUp(){
        firstName = "Tiger";
        lastName ="Foster";
        homePage = new HomePage();
        bml = new BankManagerLoginPage();
        ac = new AddCustomerPage();
        oap = new OpenAccountPage();
        cl = new CustomerLoginPage();
        acc = new AccountPage();
        cp = new CustomerPage();

    }
    @Test(priority = 0, groups = {"regression"})

    public void bankManagerShouldAddCustomerSuccessfully(){

       homePage.clickOnBankManagerLoginTab();
        bml.clickOnAddCustomerTab();
        ac.enterFirstName(firstName);
        ac.enterLastName(lastName);
        ac.enterPostcode("HA2 6JT");
        ac.clickOnAddCustomerButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully"));
        alert.accept();
        bml.clickOnHomeBtn();
    }

    @Test(priority = 1,groups = {"regression"})
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLoginTab();
        bml.clickOnOpenAccountTab();
        oap.selectCustomerName(firstName+" "+lastName );
        oap.selectCurrency("Pound");
        oap.clickOnProcessButton();
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Account created successfully "));
        alert.accept();
        bml.clickOnHomeBtn();
    }

    @Test(priority = 2,groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnCustomerLoginTab();
        cl.selectYourName(firstName+" "+lastName);
        cl.clickOnLoginButton();
        Assert.assertTrue(acc.isLogoutButtonDisplayed());
        acc.clickOnLogoutButton();
        Assert.assertTrue(cl.isYourNameLabelDisplayed());
       bml.clickOnHomeBtn();
    }

    @Test(priority = 3,groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLoginTab();
        cl.selectYourName(firstName+" "+lastName);
        cl.clickOnLoginButton();
        acc.clickOnDepositTab();
        acc.enterAmount(100);
        acc.clickOnDepositWithdrawButton();
        Assert.assertEquals(acc.getErrorSuccessMessage(),"Deposit Successful");
        acc.clickOnHomeBtn();
    }

    @Test(priority = 4,groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLoginTab();
        cl.selectYourName(firstName+" "+lastName);
        cl.clickOnLoginButton();
        acc.clickOnWithdrawlTab();
        acc.enterAmount(50);
        acc.clickOnDepositWithdrawButton();
        Assert.assertEquals(acc.getErrorSuccessMessage(),"Transaction successful");
       acc.clickOnHomeBtn();
    }

    @Test(priority = 5,groups = {"regression"})
    public void bankManagerShouldDeleteCustomerSuccessfully(){
        homePage.clickOnBankManagerLoginTab();
        bml.clickOnCustomerTab();
        cp.searchCustomerByName(firstName);
        cp.deleteCustomer();
    }




}
