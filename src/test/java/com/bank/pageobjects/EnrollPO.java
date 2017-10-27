package com.bank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnrollPO extends BasePage {
	public EnrollPO(WebDriver driver) {
		super(driver);
	}	
	
	//wells fargo image
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Wells Fargo Home Page")
	public WebElement wellsFargoImage;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Home")
	public WebElement homeLink;
	@FindBy(how = How.ID, using = "ssn")
	public WebElement ssn;
	@FindBy(how = How.ID, using = "accountNumber")
	public WebElement accountNumber;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sign On Now")
	public WebElement signOnNow;
	@FindBy(how = How.ID, using = "continue")
	public WebElement continueButton;
	//pop up
	@FindBy(how = How.ID, using = "goHomeModal")
	public WebElement goHomeModalPOPUP;
	@FindBy(how = How.ID, using = "cancel")
	public WebElement cancel;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Exit")
	public WebElement exitButton;
	
	//Logo WellsFargo
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Wells Fargo")
	public WebElement wellsFargologo;
	
	
}
