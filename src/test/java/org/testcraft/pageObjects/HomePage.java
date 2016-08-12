package org.testcraft.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcraft.core.AbstractPage;

public class HomePage extends AbstractPage {

  public HomePage(RemoteWebDriver remoteWebDriver) {
    super(remoteWebDriver);
  }

  public void enterSearchText(String input) {
    WebElement searchField = driver.findElement(By.name("q"));
    searchField.sendKeys(input);
  }

  public SearchResultsPage clickSearchButton() {
    WebElement searchButton = driver.findElement(By.name("btnG"));
    searchButton.click();
    return new SearchResultsPage(driver);
  }

}
