package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps {
    HomePage home = Selenide.page(HomePage.class);
    LoginPage login = Selenide.page(LoginPage.class);

    @And("User enters valid data")
    public void enter_valid_data() {
        login.enterData("ks@gmail.com", "Aa12345!");
    }
    @And("User clicks on Anmelden button")
    public void click_on_anmelden_button() {
        login.clickOnAnmelden();
    }
//    @And("User click on User icon")
//    public void click_on_user_icon() {
//        home = Selenide.page(HomePage.class);
//        home.clickOnUserLogin();
//    }
//    @Then("User verifies his name")
//    public void verifies_his_name() {
//        login.verifyName("Ksu ks");
//    }
    @Then("User verifies login by check mark on login icon")
    public void verifies_login_by_check_mark_on_login_icon() {
        home = Selenide.page(HomePage.class);
        home.isCheckMarkPresent();
    }

    @And("User enters wrong email and valid password")
    public void enter_wrong_email_and_valid_password(DataTable table) {
        login.enterWrongData(table);
    }

    @Then("User verifies Error message")
    public void verify_Error_message() {
        login.isErrorMessageDisplayed();
    }

}
