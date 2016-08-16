package org.testcraft.core;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcraft.pageObjects.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import java.util.concurrent.TimeUnit;

@ContextConfiguration(classes = {Context.class})
public class AbstractTest {

    @Autowired
    protected RemoteWebDriver webDriver;

    protected HomePage openHomePage() {
        webDriver.get("http://www.google.co.uk");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new HomePage(webDriver);
    }

    protected void quitDriver() {
        webDriver.quit();
    }
}
