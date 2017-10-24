package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePO extends BasePage {
	public HomePagePO(WebDriver driver) {
		super(driver);
	}
	//Logo main Links
	@FindBy(how = How.ID, using = "brand")
	public WebElement wellsFargoImage;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Enroll")
	public WebElement enrollLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Customer Service")
	public WebElement customerServiceLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "ATMs/Locations")
	public WebElement locationLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Español")
	public WebElement spanishLink;
	@FindBy(how = How.ID, using = "inputTopSearchField")
	public WebElement searchTextfield;
	@FindBy(how = How.NAME, using = "btnG")
	public WebElement searchButton;
	//Main Nav
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Personal")
	public WebElement  personalLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Small Business")
	public WebElement smallBusinessLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Commercial")
	public WebElement commercialLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Financial Education")
	public WebElement financialEducationLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "About Wells Fargo")
	public WebElement aboutWellsFargoLink;
	//Sign on Main
	@FindBy(how = How.NAME, using = "destination")
	public WebElement formdropdown;
	@FindBy(how = How.ID, using = "userid")
	public WebElement userID;
	@FindBy(how = How.ID, using = "password")
	public WebElement password;
	@FindBy(how = How.ID, using = "saveusername")
	public WebElement saveusernameCheckbox;
	@FindBy(how = How.ID, using = "btnSignon")
	public WebElement signOnButton;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Forgot Password/Username? ")
	public WebElement forgotPasswordLink;


}
