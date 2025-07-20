package com.saucedemo.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckoutPage {
    private final Locator checkoutBtn;
    private final Locator firstNameInput;
    private final Locator lastNameInput;
    private final Locator postalCodeInput;
    private final Locator continueButton;
    private final Locator finishButton;
    private final Locator totalPrice;
    private final Locator completeHeader;
    private final Locator completeText;
    private final Locator backHomeButton;

    public CheckoutPage(Page page) {
        this.checkoutBtn = page.locator("[data-test='checkout']");
        this.firstNameInput = page.locator("[data-test='firstName']");
        this.lastNameInput = page.locator("[data-test='lastName']");
        this.postalCodeInput = page.locator("[data-test='postalCode']");
        this.continueButton = page.locator("[data-test='continue']");
        this.finishButton = page.locator("[data-test='finish']");
        this.totalPrice = page.locator(".summary_total_label");
        this.completeHeader = page.locator(".complete-header");
        this.completeText = page.locator(".complete-text");
        this.backHomeButton = page.locator("[data-test='back-to-products']");
    }

    public void continueCheckout() {
        checkoutBtn.click();
    }

    public void setFirsName(String firstName) {
        firstNameInput.fill(firstName);
    }

    public void setLastName(String lastName) {
        lastNameInput.fill(lastName);
    }

    public void setPasscode(String postalCode) {
        postalCodeInput.fill(postalCode);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void clickFinish() {
        finishButton.click();
    }

    public void clickBackHome() {
        backHomeButton.click();
    }

    public String getTotalPrice() {
        return totalPrice.textContent();
    }

    public String getCompleteHeader() {
        return completeHeader.textContent();
    }

    public String getCompleteText() {
        return completeText.textContent();
    }
}