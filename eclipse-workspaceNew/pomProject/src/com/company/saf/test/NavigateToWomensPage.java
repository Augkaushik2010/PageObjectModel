package com.company.saf.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.company.saf.action.LoginAction;

public class NavigateToWomensPage extends TestCase{

@Test
public void clickWomensLink() {
	LoginAction loginAction = new LoginAction(driver);
	loginAction.clickOnWomenLink(driver);
	final String actualTitle = driver.getTitle();
	final String expectedTitle = "Women - My Store";
	Assert.assertEquals(actualTitle, expectedTitle);
}

}
 