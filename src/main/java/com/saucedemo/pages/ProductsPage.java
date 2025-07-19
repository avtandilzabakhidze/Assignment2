package com.saucedemo.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductsPage {
    private final Locator productPageTitle;
    private final Locator cartBadge;
    private final Locator cartIcon;

    public ProductsPage(Page page) {
        this.productPageTitle = page.locator(".header_secondary_container .title");
        this.cartBadge = page.locator(".shopping_cart_badge");
        this.cartIcon = page.locator(".shopping_cart_link");
    }

    public boolean loadProductPage(String pageTitle) {
        return productPageTitle.textContent().contains(pageTitle);
    }

    public String getCartProductCount() {
        return cartBadge.textContent();
    }

    public void openCart() {
        cartIcon.click();
    }
}