package steps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ContactPage;
import tests.TestBase;

@Test
public class FillInTheContactForm extends TestBase {
	HomePage hPage;
	ContactPage cPage;
	@Given("^I want to fill the contact form$")
	public void i_want_to_fill_the_contact_form() throws Throwable {
		//hPage = new HomePage(driver);
		//hPage.closeCookie();	
		cPage = new ContactPage(driver);
		cPage.closeCookie();
	}

	@When("^I click on contact button$")
	public void i_click_on_contact_button() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement contact = wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.linkText("Contact")));
		Thread.sleep(2000);
		contact.click();
	}

	@And("^write my \"([^\"]*)\"$")
	public void write_my_feedback(String feedback) throws Throwable {
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
		Thread.sleep(2000);
		cPage.ContactMsg(feedback);
		cPage.WriteName();
		cPage.WriteEmail();
		cPage.ConfirmFeedback();

	}

	@And("^click on send$")
	public void click_on_send() throws Throwable {
		cPage.ClickSubmit();
	}

	@Then("^my feedback shall be sent$")
	public void my_feedback_shall_be_sent() throws Throwable {
		System.out.println("TC 2 Passed!");
	}

}
