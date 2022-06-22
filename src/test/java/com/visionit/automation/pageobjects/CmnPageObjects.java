package com.visionit.automation.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import junit.framework.Assert;

public class CmnPageObjects {
	private static final Logger logger = LogManager.getLogger(CmnPageObjects.class);
	
	WebDriver driver;
	Scenario scn;
	
	//Locators
	private By searchBoxElement = By.id("twotabsearchtextbox");
	private By searchBtnElement = By.xpath("//input[@value = 'Go']");
	
	public CmnPageObjects(WebDriver driver, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
	}
	public void validateLandingPageTitle() {
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		Assert.assertEquals("Page Title Validation", expected, actual);
		scn.log("Page Title Validation is successful, Actual Title:" + actual);
		logger.info("Page Title Validation is successful, Actual Title:" + actual);
	}
	
	public void searchProduct(String productName) {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver,20);
		WebElement elementSearchBox = webDriverWait.until(ExpectedConditions.elementToBeClickable(searchBoxElement));
		logger.info("Created WebElement for search box");
		elementSearchBox.sendKeys(productName);
        logger.info("Product Searched: " + productName);

	}
	
	public void clickOnSearchBtn() {
		driver.findElement(searchBtnElement).click();
        scn.log("Clicked on the GO button");
        logger.info("Clicked on the GO button");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
