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
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy (xpath ="//button[@class='btn home']" )
    WebElement _homeButtonLink;
    @FindBy (xpath ="//button[contains(text(),'Customer Login')]" )
    WebElement _customerLoginTab;
    @FindBy (xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginTab;



    public void clickOnHomeBtn(){
        Reporter.log("clicking on Home button : "+ _homeButtonLink.toString()+"<br>");
        clickOnElement(_homeButtonLink);
        log.info("clicking on Home button : "+ _homeButtonLink.toString());
    }

    public void clickOnCustomerLoginTab(){
        Reporter.log("clicking on customer login button : "+ _customerLoginTab.toString()+"<br>");
        clickOnElement(_customerLoginTab);
        log.info("clicking on customer login button : "+ _customerLoginTab.toString());

    }

    public void clickOnBankManagerLoginTab(){
        Reporter.log("clicking on bank manager login button : "+ _bankManagerLoginTab.toString()+"<br>");
        clickOnElement(_bankManagerLoginTab);
        log.info("clicking on bank manager login button : "+ _bankManagerLoginTab.toString());
    }


}
