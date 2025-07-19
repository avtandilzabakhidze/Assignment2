package com.saucedemo.steps;

import com.microsoft.playwright.Page;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;

import java.util.List;

public class ProductsStep {
    private final Page page;
    private final ProductsPage productsPage;

    public ProductsStep(Page page) {
        this.page = page;
        this.productsPage = new ProductsPage(page);
    }

    public ProductsStep validateProductPageIsOpen() {
        boolean productTitle = productsPage.loadProductPage("Products");
        Assert.assertTrue(productTitle, "Product page is not open");
        return this;
    }

    public ProductsStep addProductToCart(String productName) {
        page.locator("[data-test='add-to-cart-" + productName.toLowerCase().replace(" ", "-") + "']").click();
        return this;
    }

    public ProductsStep addMultipleProductsToCart(List<String> productNames) {
        productNames.forEach(this::addProductToCart);

        return this;
    }


    public ProductsStep cardCountIsCorrect(String cardCount) {
        String cartProductCount = productsPage.getCartProductCount();

        Assert.assertEquals(cartProductCount,cardCount, "The cart product count is correct");
        return this;
    }

    public ProductsStep openCart() {
        productsPage.openCart();

        return this;
    }
}
