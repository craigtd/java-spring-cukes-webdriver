package org.testcraft.core;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcraft.pageObjects.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {Context.class})
public class AbstractTest {

    @Autowired
    protected RemoteWebDriver webDriver;

    protected HomePage openHomePage() {
        webDriver.manage().window().maximize();
        webDriver.manage().window().maximize();
        webDriver.get("http://www.google.co.uk");
        return new HomePage(webDriver);
    }
}
