package org.testcraft.core;

import org.openqa.selenium.remote.RemoteWebDriver;

public class AbstractPage {
  protected RemoteWebDriver driver;

  public AbstractPage(RemoteWebDriver remoteWebDriver){
        this.driver = remoteWebDriver;
    }
}