package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPO extends BasePage {
	public SearchPO(WebDriver driver) {
		super(driver);
	}
  
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Search Results")
	public WebElement searchResults;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Wells Fargo Careers")
	public WebElement wellsFargoLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Careers")
	public WebElement careersLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Search Jobs")
	public WebElement searchJobsLink;
}
