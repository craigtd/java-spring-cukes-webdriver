package org.testcraft.core;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean
    public RemoteWebDriver webDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        return new FirefoxDriver(capabilities);
    }
}
