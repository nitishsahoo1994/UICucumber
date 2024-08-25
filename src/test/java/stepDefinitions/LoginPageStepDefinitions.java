package stepDefinitions;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import utils.TestBase;

public class LoginPageStepDefinitions extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	public static WebDriver driver;
	
	
	@Given("User open url")
	public void user_open_url() throws MalformedURLException {
		System.out.println("user oprn url");
		launchApp();
	}
	@Then("Title of Login page is {string}")
	public void title_of_login_page_is(String string) {
		Assert.assertEquals(string, "My webMethods: My webMethods Login Page");
	}
	
	@When("User enters user name as {string} and password as {string} and click on login button")
	public HomePage user_enters_user_name_as_and_password_as_and_click_on_login_button(String userName, String password) {
		loginPage=new LoginPage();
		homepage=loginPage.login(userName, password);
		return homepage;
	}
	
	
	@Then("User close browser")
	public void user_close_browser() {
		System.out.println("close url");
		quitBrowser();
	}
	
	
	
	

}
