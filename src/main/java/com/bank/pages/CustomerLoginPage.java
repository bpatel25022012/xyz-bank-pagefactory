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
*/public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

//    By yourName = By.id("userSelect");
//    By loginBtn = By.xpath("//button[@class='btn btn-default']");
//    By yourNameLabel = By.xpath("//div[@class='form-group']//label");

 @FindBy(id ="userSelect" )
    WebElement _yourName;

 @FindBy (xpath ="//button[@class='btn btn-default']" )
 WebElement _loginBtn;

 @FindBy(xpath ="//div[@class='form-group']//label" )
 WebElement _yourNameLabel;

    public void selectYourName(String name){
        clickOnElement(_yourName);
        Reporter.log("selecting customer name : "+name+_yourName.toString()+"<br>");
        selectByVisibleTextFromDropDown(_yourName, name);
        log.info("selecting customer name : "+name+_yourName.toString());
    }

    public void clickOnLoginButton(){
        Reporter.log("clicking on  login button : "+ _loginBtn.toString()+"<br>");
        clickOnElement(_loginBtn);
        log.info("clicking on  login button : "+ _loginBtn.toString());
    }

    public boolean isYourNameLabelDisplayed(){
        if ((_yourNameLabel).isDisplayed()){
            Reporter.log("checking : "+_yourNameLabel.toString()+"is Displayed"+"<br>");
            log.info ("checking : "+_yourNameLabel.toString()+"is Displayed");
            return true;
        }else {
            return false;
        }
    }



}
