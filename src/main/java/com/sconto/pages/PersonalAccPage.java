package com.sconto.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class PersonalAccPage {

    @FindBy(xpath = "//a[@href='/bestellung/logout']")
    private WebElement logoutBtn;

    public LoginPage clickOnLogoutButton() {
        $(logoutBtn).click();
        return Selenide.page(LoginPage.class);
    }
}
