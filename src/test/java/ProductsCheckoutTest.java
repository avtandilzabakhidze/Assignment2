import com.saucedemo.steps.CheckoutStep;
import com.saucedemo.steps.LoginStep;
import com.saucedemo.steps.ProductsStep;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.saucedemo.data.Constants.*;

public class ProductsCheckoutTest extends BaseTest {
    private LoginStep loginStep;
    private ProductsStep productsStep;
    private CheckoutStep checkoutStep;

    @BeforeMethod
    public void beforeMethod() {
        loginStep = new LoginStep(page);
        productsStep = new ProductsStep(page);
        checkoutStep = new CheckoutStep(page);
    }

    @Test
    public void addTwoMultipleProductsAndCheckout() {
        loginStep.login(USER_NAME, PASSWORD);

        productsStep.validateProductPageIsOpen()
                .addMultipleProductsToCart(productsStep.getProductsWithQuantity(2))
                .cardCountIsCorrect(NUMBER)
                .openCart();

        checkoutStep
                .continueToCheckout()
                .fillCheckoutInformation(FIRST_NAME, LAST_NAME, PASSCODE)
                .continueToOverview();

        checkoutStep
                .validateTotalPriceExists()
                .finishCheckout();

        checkoutStep
                .validateCheckoutComplete()
                .backToProducts();

        productsStep.validateProductPageIsOpen();
    }
}
