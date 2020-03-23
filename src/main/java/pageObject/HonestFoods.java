package pageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import commonUtils.BaseClass;

public class HonestFoods extends BaseClass{

	public HonestFoods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 120);
	
	@FindBy(xpath="//span[text()='Zur Speisekarte']")
	private List<WebElement> gotoCheckoutPage;
	
	@FindBy(id="address-input")
	private WebElement addressBar;
	
	
	public void verifyHomePage() {
		wait.until(ExpectedConditions.visibilityOf(gotoCheckoutPage.get(0)));
		wait.until(ExpectedConditions.elementToBeClickable(gotoCheckoutPage.get(0)));
		if(gotoCheckoutPage.size()>0) {
			System.out.println("Checkout page icon is displaying correctly");
		}
		
	}
	
	public void clickOnCheckoutLinkAndVerifyPage(String arg1) {
		gotoCheckoutPage.get(0).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(addressBar));
		wait.until(ExpectedConditions.elementToBeClickable(addressBar));
		addressBar.clear();
		addressBar.sendKeys(arg1);
	}
	
	
}
