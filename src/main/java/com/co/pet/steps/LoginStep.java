package com.co.pet.steps;

import com.co.pet.pagesobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class LoginStep {
    LoginPage loginHomePage = new LoginPage();

    @Step
    public void openBrowser() {
        loginHomePage.open();
    }

    @Step
    public void selectSignIn() {
        loginHomePage.getDriver().findElement(loginHomePage.getBTN_SIGNIN()).click();

    }

    @Step
    public void addUser() {
        loginHomePage.getDriver().findElement(loginHomePage.getTXT_USERNAME()).sendKeys("mbuitragoa");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Step
    public void addPassword() {
        loginHomePage.getDriver().findElement(loginHomePage.getTXT_PASSWORD()).sendKeys("123456789");
    }

    @Step
    public void clickLogin() {
        loginHomePage.getDriver().findElement(loginHomePage.getBTN_LOGIN()).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void validateMessageLogin() {
        Assert.assertThat(loginHomePage.getDriver().findElement(loginHomePage.getLBL_WELCOME()).isDisplayed(), Matchers.is(true));
    }
}
