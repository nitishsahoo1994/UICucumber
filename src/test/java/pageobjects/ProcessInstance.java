package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Action;
import utils.TestBase;

public class ProcessInstance extends TestBase {
	
	
	@FindBy(xpath = "")
	WebElement clickInstanceDetails;
	
	
	@FindBy(css = "input[id$='searchBarForm:searchBarControl:keywordsTextInput']")
	WebElement searchBox;
	
	@FindBy(css = "button[id$='searchBarForm:searchBarControl:asyncSimpleSearchGoButton']")
	WebElement searchBtn;
	
	
	public void clickOnSerach() {
		Action.click(driver, searchBtn);
	}
	
	public ProcessInstance() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchOnProcessInstance(String processInstanceName) {
		Action.type(searchBox, processInstanceName);
		Action.click(driver, searchBtn);
		
	}
}
