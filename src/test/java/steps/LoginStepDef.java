package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankAndCash;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDef   {
	
	 WebDriver driver;
	LoginPage loginpage;
	//@Before
	public void startBrowser() {
		driver = BrowserFactory.init();
	}
	
	
	

	@Given("^User is on the techfioslogin page$")
	
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
		loginpage = PageFactory.initElements(driver, LoginPage.class);
	  
	}

	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_username_and_password(String username, String password) {
		loginpage.enterCredentials(username, password);
	}

	@And("^user click on the signin button$")
	public void user_click_on_the_signin_button() throws Throwable {
		loginpage.signInButtonToLogin();
	}

	@When("^User should land on the Dashboard page$")
	public void user_should_land_on_the_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginpage.takeScreenshotAtEndOfTest(driver);
	}
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
