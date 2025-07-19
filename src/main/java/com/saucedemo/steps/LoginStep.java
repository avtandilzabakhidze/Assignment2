package com.saucedemo.steps;

import com.microsoft.playwright.Page;
import com.saucedemo.pages.LoginPage;

public class LoginStep {
    private final Page page;
    private final LoginPage loginPage;

    public LoginStep(Page page) {
        this.page = page;
        this.loginPage = new LoginPage(page);
    }

    public LoginStep login(String username, String password) {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLogin();
        return this;
    }
}
