package org.testcraft.test;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.testcraft.core.AbstractTest;
import org.testcraft.pageObjects.HomePage;

public class SearchTest extends AbstractTest{

    HomePage homePage;

    @Given("^I'm on google\\.co\\.uk main page$")
    public void i_m_on_google_co_uk_main_page() throws Throwable {
        homePage = openHomePage();
        Thread.sleep(5000);
    }

    @After
    public void after(){
        webDriver.quit();
    }
}
