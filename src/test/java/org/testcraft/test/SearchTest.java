package org.testcraft.test;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.testcraft.core.AbstractTest;
import org.testcraft.pageObjects.HomePage;
import org.testcraft.pageObjects.SearchResultsPage;

import java.util.List;

public class SearchTest extends AbstractTest{

  HomePage homePage;
  SearchResultsPage searchResultsPage;


  @Given("^I'm on google\\.co\\.uk main page$")
  public void imOnGoogleMainPage() throws Throwable {
    homePage = openHomePage();
  }

  @When("^I enter search phrase \"([^\"]*)\"$")
  public void iEnterSearchPhrase(String searchPhrase) {
    homePage.enterSearchText(searchPhrase);
  }

  @And("^I click search$")
  public void iClickSearch() {
    searchResultsPage = homePage.clickSearchButton();
  }

  @Then("^Link \"([^\"]*)\" should be displayed as first one$")
  public void linkShouldBeDisplayedAsFirstOne(String expectedLink) {
    List<WebElement> searchResults = searchResultsPage.getSearchResults();
    String firstLinkResult = searchResults.get(0).getText();
    System.out.println("First link: " + firstLinkResult);
    assert firstLinkResult.equals(expectedLink);
  }

  @After
  public void after(){
    webDriver.quit();
  }
}
