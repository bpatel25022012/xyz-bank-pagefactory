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
public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());


    @FindBy (xpath = "//select[@id='userSelect']")
    WebElement _customerName;

    @FindBy (xpath ="//select[@id='currency']" )
    WebElement _currency;

    @FindBy (xpath ="//button[contains(text(),'Process')]")
    WebElement _processBtn;

    public void selectCustomerName(String cName){
        clickOnElement(_customerName);
        Reporter.log("selecting customer name : "+cName+ _customerName.toString()+"<br>");
        selectByVisibleTextFromDropDown(_customerName, cName);
        log.info("selecting customer name : "+cName+ _customerName.toString());
    }

    public void selectCurrency(String currency){
        Reporter.log("selecting currency : "+ currency+ _currency.toString()+"<br>");
        selectByVisibleTextFromDropDown(this._currency, currency);
        log.info("selecting currency : "+ currency+ _currency.toString());
    }

    public void clickOnProcessButton(){
        Reporter.log("clicking on process button :" + _processBtn.toString()+"<br>");
        log.info("clicking on process button :" + _processBtn.toString());
        clickOnElement(_processBtn);

    }



}
