package com.Test;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features", // folder name
    glue = "stepDefinition" // package name
)
public class TestRunner {
}
