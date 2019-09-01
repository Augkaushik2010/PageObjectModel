package com.company.saf.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	  public static WebElement getUserName(final WebDriver driver) { 
	    return driver.findElement(By.id("email"));
	  }
	  public static WebElement getPassword(final WebDriver driver) { 
	     return driver.findElement(By.id("passwd"));
	  }
	   public static WebElement getLoginButton(final WebDriver driver) { 
	      return driver.findElement(By.id("SubmitLogin"));
	   }
	   public static WebElement getWomenLink(final WebDriver driver) {
		   return driver.findElement(By.linkText("Women"));
	   }
	   public static WebElement getTopsLink(final WebDriver driver) {
		   //return driver.findElement(By.xpath("//*[@id='categories_block_left']//a[contains(text(),'Tops')])"));
		   //return driver.findElement(By.xpath("//*[@id=\'categories_block_left\']//a[(contains(@title,'tank tops') and contains(@href,'controller')"));
		   return driver.findElement(By.xpath("//*[@id='categories_block_left']//li[1]//*[contains(@href,'http://automationpractice.com/index.php?id_category=4&controller=category')]"));
	   }
	   public static WebElement getTopsLinkExpand(final WebDriver driver) {
		   return driver.findElement(By.xpath("//*[@id='categories_block_left']//a[contains(@title,'Choose from')]"));
	   }
	   public static WebElement getDressesLinkExpand(final WebDriver driver) {
		   return driver.findElement(By.xpath("//*[@id='categories_block_left']//a[contains(@title,'favorites dresses')]"));
	   }
	   public static WebElement getSortLstInDressesPg(final WebDriver driver) {
		   return driver.findElement(By.xpath("//*[@id='selectProductSort']/option[6]"));
	   }
	   
	   public static WebElement getTextMsgOfItems(final WebDriver driver) {
		   return driver.findElement(By.xpath("(//*[contains(text(),'Showing')])[1]"));
	   }
	   public static WebElement getTextOnButtonsPsarees(final WebDriver driver) {
		   return driver.findElement(By.xpath("(//span[@class='available-now'])[2]"));
	   }
	}
