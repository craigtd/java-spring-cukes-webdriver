package org.testcraft.test;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testcraft.core.AbstractTest;
import org.testcraft.pageObjects.HomePage;
import org.testcraft.pageObjects.SearchResultsPage;

public class SearchTest extends AbstractTest{

  HomePage homePage;
  SearchResultsPage searchResultsPage;

  @Given("^I'm on google\\.co\\.uk main page$")
  public void openGoogleMainPage() throws Throwable {
    homePage = openHomePage();
  }

  @When("^I enter search phrase \"([^\"]*)\"$")
  public void enterSearchPhrase(String searchPhrase) {
    homePage.enterSearchText(searchPhrase);
  }

  @And("^I click search$")
  public void clickSearch() {
    searchResultsPage = homePage.clickSearchButton();
  }

  @Then("^Link \"([^\"]*)\" should be displayed as first one$")
  public void linkShouldBeDisplayedAsFirstOne(String expectedLink) {
    assert expectedLink.equals(searchResultsPage.getSearchResultAt(0));
  }

  @After
  public void after(){
    quitDriver();
  }
}
