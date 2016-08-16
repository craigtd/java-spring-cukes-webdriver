package org.testcraft.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testcraft.core.AbstractPage;
import java.util.List;

public class SearchResultsPage extends AbstractPage {

  @FindBy(how = How.XPATH, xpath = ".//*[@id='rso']/div/div/div/div/div/div/cite")
  private List<WebElement> searchResults;

  public SearchResultsPage(RemoteWebDriver remoteWebDriver) {
    super(remoteWebDriver);
    PageFactory.initElements(remoteWebDriver, this);
  }

  public String getSearchResultAt(int n) {
    return searchResults.get(n).getText();
  }
}
