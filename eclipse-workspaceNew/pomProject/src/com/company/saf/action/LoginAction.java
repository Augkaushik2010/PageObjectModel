package com.company.saf.action;

import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import com.company.saf.page.LoginPage;

public class LoginAction {
	public LoginAction(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void login(final String username, final String password, WebDriver driver) { 
	    LoginPage.getUserName(driver).sendKeys(username);
	    LoginPage.getPassword(driver).sendKeys(password);
	    LoginPage.getLoginButton(driver).click();
	  }
	public void clickOnWomenLink(WebDriver driver) {
		LoginPage.getWomenLink(driver).click();
	}
	public void clickOnTopsLink(WebDriver driver) {
		LoginPage.getTopsLink(driver).click();
	}
	public void clickOnTopsLinkExpand(WebDriver driver) {
		LoginPage.getTopsLinkExpand(driver).click();
	}
	public void clickOnDressesLink(WebDriver driver){
		LoginPage.getDressesLinkExpand(driver).click();
	}
	public void selectSortOrderOnDressesPg(WebDriver driver){
		LoginPage.getSortLstInDressesPg(driver).click();
	}
	
	public void validteAllLinksDisplayed(WebDriver driver) {
		
		String itemsCountText = LoginPage.getTextMsgOfItems(driver).getText();
		String[] arrSplit=itemsCountText.split(" ");
		int itemsCnt = Integer.parseInt(arrSplit[5]);
		int actCount=0;
		for(int i=1;i<=itemsCnt;i++) {
			String dispButtonName = LoginPage.getTextOnButtonsPsarees(driver).getText();
			if(dispButtonName.trim().equalsIgnoreCase("In stock")) {
				actCount= actCount+1;
			}
		}
		
		if (actCount==itemsCnt) {
			System.out.println("In Stock links matched with the no.of items in the page.");
		}
	}
	

	}
	

