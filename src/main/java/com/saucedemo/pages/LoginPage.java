package com.saucedemo.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private final Locator userNameInput;
    private final Locator passwordInput;
    private final Locator loginButton;

    public LoginPage(Page page) {
        this.userNameInput = page.locator("#user-name");
        this.passwordInput = page.locator("#password");
        this.loginButton = page.locator("#login-button");
    }

    public void setUsername(String username) {
        userNameInput.fill(username);
    }

    public void setPassword(String password) {
        passwordInput.fill(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
