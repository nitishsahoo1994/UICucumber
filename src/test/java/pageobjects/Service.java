package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Action;
import utils.TestBase;

public class Service extends TestBase {
	
	
	@FindBy(css = "input[id$='searchBarForm:searchBarControl:keywordsTextInput']")
	WebElement searchBox;
	
	
	@FindBy(css = "button[id$='searchBarForm:searchBarControl:asyncSimpleSearchGoButton']")
	WebElement searchBtn;
	
	public Service() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchOnProcessInstance(String serviceName) {
		Action.type(searchBox, serviceName);
		Action.click(driver, searchBtn);
	}
}
