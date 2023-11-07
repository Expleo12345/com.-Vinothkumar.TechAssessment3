package com.Vinothkumar.TechAssessment3;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageLocators {
		@FindBy(xpath="//a[text()=\"vinothbcr74@gmail.com\"]")
		WebElement verifyText;
		
		@FindBy(xpath="//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")
		WebElement VerifyErrorMessage;
		@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div") public WebElement WhishlistText;
		@FindBy(xpath="//li[text()=\"The specified email already exists\"]")
		WebElement HomePageError;
	
 
 
 
}