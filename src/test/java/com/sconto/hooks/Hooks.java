package com.sconto.hooks;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import com.sconto.pages.PersonalAccPage;
import io.cucumber.java.After;


public class Hooks {
    HomePage home = Selenide.page(HomePage.class);
    LoginPage login = Selenide.page(LoginPage.class);
    PersonalAccPage account = Selenide.page(PersonalAccPage.class);

    @After("@validData")
    public void validLoginPostcondition(){
        try{
            home.clickOnLoginButton();
            account.clickOnLogoutButton();
        }catch(Exception e){
            e.getMessage();
        }

    }


}
