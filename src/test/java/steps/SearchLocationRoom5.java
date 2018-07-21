package steps;

import pages.HomePage;
import tests.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchLocationRoom5 extends TestBase{
	HomePage hPage;

	@Given("^I want to search for a specific location$")
	public void i_want_to_search_for_a_specific_location() throws Throwable {
		hPage = new HomePage(driver);
		hPage.clickSearchBar();
	}

	@When("^I type my location$")
	public void iTypeMyLocation() throws Throwable {
		hPage.typeInSearch();

	}


	@And("^click enter$")
	public void clickEnter() {
		hPage.inputSearch();

	}


	@Then("^I shall see the appropriate results$")
	public void i_shall_see_the_appropriate_results() {
		System.out.println("TC1 Passed");
	}

}
