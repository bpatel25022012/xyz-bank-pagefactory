package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
Created By Bhavesh
*/
public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    @FindBy (xpath ="//button[@class='btn logout']" )
    WebElement logOutBtn;
    @FindBy (xpath ="//button[contains(text(),'Transactions')]" )
    WebElement transactionTab;
    @FindBy (xpath ="//button[contains(text(),'Deposit')]" )
    WebElement depositTab;
    @FindBy (xpath ="//button[contains(text(),'Withdrawl')]" )
    WebElement withdrawlTab;
    @FindBy (xpath ="//input[@placeholder='amount']" )
    WebElement _amount;
    @FindBy (xpath ="//button[@class='btn btn-default']" )
    WebElement depositWithdrawBtn;
    @FindBy (xpath ="//span[@class='error ng-binding']" )
   WebElement errorMessage;
    @FindBy (xpath ="//button[@class='btn home']" )
    WebElement homeButtonTab;

    public void clickOnLogoutButton() {
        Reporter.log("clicking on logout button : "+logOutBtn.toString()+"<br>");
        clickOnElement(logOutBtn);
        log.info("clicking on logout button : "+logOutBtn.toString());
    }

    public boolean isLogoutButtonDisplayed() {
        if ((logOutBtn).isDisplayed()) {

            return true;
        } else {
            return false;
        }
    }

    public void clickOnTransactionTab() {
        Reporter.log("clicking on transaction tab : "+ transactionTab.toString()+"<br>");
        clickOnElement(transactionTab);
        log.info("clicking on transaction tab : "+ transactionTab.toString());
    }

    public void clickOnDepositTab() {
        Reporter.log("clicking on deposit tab : "+ depositTab.toString()+"<br>");
        clickOnElement(depositTab);
        log.info("clicking on deposit tab : "+ depositTab.toString());
    }

    public void clickOnWithdrawlTab() {
        Reporter.log("clicking on withdrawl tab : "+ withdrawlTab.toString()+"<br>");
        clickOnElement(withdrawlTab);
        log.info("clicking on withdrawl tab : "+ withdrawlTab.toString());
    }

    public void enterAmount(int amount) {
        Reporter.log("entering amount in the amount field : " + amount +_amount.toString()+"<br>");
        sendTextToElement(this._amount, String.valueOf(amount));
        log.info("entering amount in the amount field : " + amount +_amount.toString());
    }

    public void clickOnDepositWithdrawButton() {
        Reporter.log("clicking on depositwithdrawl button "+ depositWithdrawBtn.toString()+"<br>");
        clickOnElement(depositWithdrawBtn);
        log.info("clicking on depositwithdrawl button "+ depositWithdrawBtn.toString());
    }

    public String getErrorSuccessMessage() {
        Reporter.log("Getting error message : " +errorMessage.toString() + "<br>");
        log.info("Getting error message : " +errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void clickOnHomeBtn() {
        Reporter.log("clicking on home button tab : "+ homeButtonTab.toString()+"<br>");
        clickOnElement(homeButtonTab);
        log.info("clicking on home button tab : "+ homeButtonTab.toString());

    }
}

