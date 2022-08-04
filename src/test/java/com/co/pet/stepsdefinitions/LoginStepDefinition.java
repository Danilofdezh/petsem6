package com.co.pet.stepsdefinitions;

import com.co.pet.steps.LoginStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;


    @Given("^the user is on the page$")
    public void theUserIsOnThePage() {
        loginStep.openBrowser();
        loginStep.selectSignIn();

    }

    @When("^he user enter credentials$")
    public void heUserEnterCredentials() {
    loginStep.addUser();
    loginStep.addPassword();
    loginStep.clickLogin();
    }

    @Then("^successful entry$")
    public void successfulEntry() {
    loginStep.validateMessageLogin();
    }
}
