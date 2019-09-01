package com.company.saf.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.company.saf.action.LoginAction;

public class NavigateToDressesPage extends TestCase{

LoginAction LA = new LoginAction(driver);

@Test(priority=1)
public void clickWomensLink() {
	LA.clickOnWomenLink(driver);
	final String actualTitle = driver.getTitle();
	final String expectedTitle = "Women - My Store";
	Assert.assertEquals(actualTitle, expectedTitle);
}

@Test(priority=2)
public void clickDressesLink(){
	LA.clickOnDressesLink(driver);
	final String actualTitle = driver.getTitle();
	final String expectedTitle = "Dresses - My Store";
	Assert.assertEquals(actualTitle, expectedTitle);
}

}
 