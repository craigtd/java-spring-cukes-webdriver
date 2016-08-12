package org.testcraft.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testcraft.core.AbstractPage;
import java.util.List;

public class SearchResultsPage extends AbstractPage {

  public SearchResultsPage(RemoteWebDriver remoteWebDriver) {
    super(remoteWebDriver);
    PageFactory.initElements(remoteWebDriver, this);
  }

  public List<WebElement> getSearchResults() {
    return driver.findElements(By.xpath(".//*[@id='rso']/div/div/div/div/div/div/cite"));
  }
}
