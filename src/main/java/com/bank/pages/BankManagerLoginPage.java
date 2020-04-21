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
*/public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @FindBy (xpath ="//button[contains(text(),'Add Customer')]" )
    WebElement _addCustomerTab;
    @FindBy (xpath ="//button[contains(text(),'Open Account')]" )
    WebElement _openAccountTab;
    @FindBy (xpath ="//button[contains(text(),'Customers')]" )
    WebElement _customersTab;
    @FindBy (xpath ="//button[@class='btn home']" )
    WebElement _homeButtonTab;


    public void clickOnAddCustomerTab()
    {
        Reporter.log("clicking on add customer tab : "+ _addCustomerTab.toString()+"<br>");
        clickOnElement(_addCustomerTab);
        log.info("clicking on add customer tab : "+ _addCustomerTab.toString());
    }

    public void clickOnOpenAccountTab(){
        Reporter.log("clicking on open account tab : "+ _openAccountTab.toString()+"<br>");
        clickOnElement(_openAccountTab);
        log.info("clicking on open account tab : "+ _openAccountTab.toString());
    }

    public void clickOnCustomerTab(){
        Reporter.log("clicking on customer tab : "+ _customersTab.toString()+"<br>");
        clickOnElement(_customersTab);
        log.info("clicking on customer tab : "+ _customersTab.toString());
    }
    public void clickOnHomeBtn(){
        Reporter.log("clicking on home tab : "+ _homeButtonTab.toString()+"<br>");
        clickOnElement(_homeButtonTab);
        log.info("clicking on home tab : "+ _homeButtonTab.toString());
    }


}