package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CareersPO extends BasePage {
	public CareersPO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "skip")
	public WebElement careersPage;
//	@FindBy(how = How., using = "")
//	public WebElement ;

}
