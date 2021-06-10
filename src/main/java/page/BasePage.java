package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	
	public  void clickElement(WebElement element,WebDriver driver ) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", element);
	   }
	public  void waitforElement ( int waitTime, By element ,WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	   }
	public  void selectElement(WebElement element, String text) {
		 Select sel = new Select(element);
		   sel.selectByVisibleText(text);
		}
	public int  randomNumber(int numbers) {
		Random random = new Random();
		int number = random.nextInt(numbers);
		return number;
		
	}

}
