package org.testcraft.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"src/test/resources/org/testcraft/features/Search.feature"},
  format = {"pretty", "json:target/cucumber.json"},
  glue = {"org.testcraft.test"})
public class RunnerTest {}
