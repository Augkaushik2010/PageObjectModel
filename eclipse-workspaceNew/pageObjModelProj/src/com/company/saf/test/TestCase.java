package com.company.saf.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;

import com.company.saf.page.LoginPage;

public class TestCase {
	
	public WebDriver driver;
	String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String username = "rajkumar2019uk@gmail.com";
	String password = "Honey@123";
	@BeforeTest
	public void init() { 
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium_Projects\\chromedrvrlat\\chromedriver.exe"); 
	    driver = new ChromeDriver();
	    driver.get(url);
	    
		LoginPage.getUserName(driver).sendKeys(username);
		LoginPage.getPassword(driver).sendKeys(password);
		LoginPage.getLoginButton(driver).click();
		  
	 }
	//@AfterSuite
	@AfterTest
	public void tearDown() {
	    driver.close();
	    driver.quit();
	 }
}
