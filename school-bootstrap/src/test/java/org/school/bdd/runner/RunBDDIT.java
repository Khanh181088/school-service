package org.school.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"org.school.bdd", "cucumber.api.spring"},
        plugin = {"pretty"})
public class RunBDDIT {}
