package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Action;
import utils.TestBase;


public class HomePage extends TestBase{
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement signoutBtn;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	public void signOut() {
		Action.click(driver, signoutBtn);
	}
}
