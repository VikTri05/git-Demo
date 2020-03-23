package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObject.HonestFoods;

public class StepDefinitions extends BaseClass{
	
	
	HonestFoods shopPage;
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	@Given("^the user launches the app on the desktop$")
	public void verifyHomepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./target/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.https://clubkitchen.at/.in/");
		}
	

	@And("^the user is on the homepage$")
	public void verifyHomePage() {
		shopPage = new HonestFoods(driver);
		shopPage.verifyHomePage();
	}
	
	@And("^the user goes to the checkout page and adds the address \"([^\"]*)\"$")
	public void navigateToCheckoutPage(String arg1) {
		shopPage.clickOnCheckoutLinkAndVerifyPage(arg1);
	}
	
}
