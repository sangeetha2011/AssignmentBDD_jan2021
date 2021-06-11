package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankAndCash extends BasePage  {
	 WebDriver driver;
  
	 public BankAndCash (WebDriver driver) {
			this.driver = driver;
		}
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANK_AND_CASH_FIELD; 
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement NEW_ACCOUNT_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_FIELD; 
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement CONTACT_PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement INTERNET_BANKING_URL_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Submit')]")
	WebElement NEW_ACCOUNT_SUBMIT_FIELD;
	
   
   public void clickbankandcashButton() throws Throwable {

		BANK_AND_CASH_FIELD.click();
	 }
	
	public void clickNewAccountButton() {
		NEW_ACCOUNT_FIELD.click();
	}

	public void enterAccountTitle(String titlename) {
		 ACCOUNT_TITLE_FIELD.sendKeys(titlename+randomNumber(999));
	}

	public void enterDescriptionField(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
	}

	public void enterIntialBalance(String balance) {
		INITIAL_BALANCE_FIELD.sendKeys(balance);
	}

	public void enterAccountNumber(int accountnumber) {
		String acNum ;
		acNum = String.valueOf(accountnumber);
		ACCOUNT_NUMBER_FIELD.sendKeys(acNum+randomNumber(999));
	}

	public void enterContactPerson(String contactPerson) {
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
	}

	public void enterContactNumber(int contactNumber) {
		 String phnum;
		 phnum = String.valueOf(contactNumber);
		CONTACT_PHONE_FIELD.sendKeys(phnum +randomNumber(999));
	}

	public void enterInternetBankingUrlField(String bankingurl) {
		INTERNET_BANKING_URL_FIELD.sendKeys(bankingurl);
	}

	public void clickSubmitButtonInNewAccount() {
		NEW_ACCOUNT_SUBMIT_FIELD.click();
	}

	 public String getPageTitle() {
		  return driver.getTitle();
		 }
  public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot)driver);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		  Date date = new Date();
		  String label = formatter.format(date);
		  String currentDirectory = System.getProperty("user.dir");
		  FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label +".png"));

		 }
}
