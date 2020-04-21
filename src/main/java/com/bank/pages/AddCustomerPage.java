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
*/public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());


    @FindBy (xpath ="//input[@placeholder='First Name']" )
    WebElement firstName;
    @FindBy(xpath ="//input[@placeholder='Last Name']" )
    WebElement lastName;
    @FindBy (xpath ="//input[@placeholder='Post Code']")
    WebElement postcode;
    @FindBy (xpath ="//form[@name='myForm']//button[contains(text(),'Add Customer')]" )
    WebElement _addCustomerBtn;



    public void enterFirstName(String fName) {
        Reporter.log("entering firstname on firstname field : "+fName+firstName.toString()+"<br>");
        sendTextToElement(firstName, fName);
        log.info("entering firstname on firstname field : "+fName+firstName.toString());
    }

    public void enterLastName(String lName) {
        Reporter.log("entering lastname on lastname field : "+lName+lastName.toString()+"<br>");
        sendTextToElement(lastName, lName);
        log.info("entering lastname on lastname field : "+lName+lastName.toString());
    }

    public void enterPostcode(String pCode) {
        Reporter.log("entering postcode on postcode field : "+pCode+postcode.toString()+"<br>");
        sendTextToElement(postcode, pCode);
        log.info("entering postcode on postcode field : "+pCode+postcode.toString());
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("clicking on add button : " + _addCustomerBtn.toString()+"<br>");
        log.info("clicking on add  button : " +_addCustomerBtn.toString());
        clickOnElement(_addCustomerBtn);

    }

}

