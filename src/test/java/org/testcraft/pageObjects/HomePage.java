package org.testcraft.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testcraft.core.AbstractPage;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

  @FindBy(how = How.NAME, name = "q")
  private WebElement searchField;

  @FindBy(how = How.NAME, name = "btnG")
  private WebElement searchButton;

  public HomePage(RemoteWebDriver remoteWebDriver) {
    super(remoteWebDriver);
    PageFactory.initElements(remoteWebDriver, this);
  }

  public void enterSearchText(String input) {
    searchField.sendKeys(input);
  }

  public SearchResultsPage clickSearchButton() {
    searchButton.click();
    return new SearchResultsPage(driver);
  }

}
