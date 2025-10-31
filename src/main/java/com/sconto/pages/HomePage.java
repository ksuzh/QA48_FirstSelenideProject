package com.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    @FindBy(css = "[data-accept-action='all']")
    WebElement acceptAll;
    public HomePage acceptCookies() {
        if($(acceptAll).exists()){
            $(acceptAll).click();
        }
        return Selenide.page(this);
    }

    @FindBy(css = ".headerElement--login")
    WebElement loginIcon;
    public LoginPage clickOnLoginButton() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }

    @FindBy(css = "span.headerElement_status--login")
    WebElement statusLoginIcon;
    public HomePage isCheckMarkPresent() {
        Assert.assertTrue($(statusLoginIcon).isDisplayed());
        return Selenide.page(this);
    }
}
