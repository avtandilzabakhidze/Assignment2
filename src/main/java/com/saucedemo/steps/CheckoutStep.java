package com.saucedemo.steps;

import com.microsoft.playwright.Page;
import com.saucedemo.pages.CheckoutPage;
import org.testng.Assert;

public class CheckoutStep {
    private final Page page;
    private final CheckoutPage checkoutPage;

    public CheckoutStep(Page page) {
        this.page = page;
        this.checkoutPage = new CheckoutPage(page);
    }

    public CheckoutStep continueToCheckout() {
        checkoutPage.continueCheckout();
        return this;
    }

    public CheckoutStep fillCheckoutInformation(String firstName, String lastName, String postalCode) {
        checkoutPage.setFirsName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPasscode(postalCode);
        return this;
    }

    public CheckoutStep continueToOverview() {
        checkoutPage.clickContinue();
        return this;
    }

    public CheckoutStep validateTotalPriceExists() {
        String totalPrice = checkoutPage.getTotalPrice();
        Assert.assertNotNull(totalPrice, "Total price is not displayed");
        return this;
    }

    public CheckoutStep finishCheckout() {
        checkoutPage.clickFinish();
        return this;
    }

    public CheckoutStep validateCheckoutComplete() {
        String completeHeader = checkoutPage.getCompleteHeader();
        Assert.assertEquals(completeHeader, "Thank you for your order!",
                "Checkout complete header is incorrect");

        String completeText = checkoutPage.getCompleteText();
        Assert.assertTrue(completeText.contains("dispatched"),
                "Checkout complete text doesn't contain expected message");

        return this;
    }

    public CheckoutStep backToProducts() {
        checkoutPage.clickBackHome();
        return this;
    }
}