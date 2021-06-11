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

public class BankAndCashStepDef {
	WebDriver driver;
	LoginPage loginpage;
	BankAndCash bankandcash;

	@Before
	public void startBrowser() {
		driver = BrowserFactory.init();
	}
	

	@Given("^User is on the techfios login page$")

	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
		loginpage = PageFactory.initElements(driver, LoginPage.class);
    }

	@When("^user enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_username_and_password(String username, String password) {
		loginpage.enterCredentials(username, password);
	}

	@And("^user clicks on the signin button$")
	public void user_click_on_the_signin_button() throws Throwable {
		loginpage.signInButtonToLogin();
	}

	@When("^user should land on Dashboard page$")
	public void user_should_land_on_the_Dashboard_page() throws Throwable {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		loginpage.takeScreenshotAtEndOfTest(driver);
	}

	@Then("^User clicks on bank and cash$")
	public void user_clicks_on_the_bank_and_cash() throws Throwable {
		bankandcash = PageFactory.initElements(driver, BankAndCash.class);

		bankandcash.clickbankandcashButton();

	}

	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {

		bankandcash.clickNewAccountButton();

	}
    @When("^User fill up the form entering \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and clicks submit$")
	public void user_fill_up_the_form_entering_details(String accountTitle, String description, String initialBalance,
			int accountNumber, String contactPerson, int phone, String internetBankingUrl) throws Throwable {
		bankandcash.enterAccountTitle(accountTitle);
		bankandcash.enterDescriptionField(description);
		bankandcash.enterIntialBalance(initialBalance);
		bankandcash.enterAccountNumber(accountNumber);
		bankandcash.enterContactPerson(contactPerson);
		bankandcash.enterContactNumber(phone);
		bankandcash.enterInternetBankingUrlField(internetBankingUrl);
		bankandcash.clickSubmitButtonInNewAccount();
	}

	@Then("^User should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws Throwable {
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = bankandcash.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		bankandcash.takeScreenshotAtEndOfTest(driver);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
