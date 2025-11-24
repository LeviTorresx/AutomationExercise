package co.com.autoex.QA.stepdefinitions;

import co.com.autoex.QA.questions.AccountCreated;
import co.com.autoex.QA.questions.ItemInShoppingCart;
import co.com.autoex.QA.tasks.ClickOn;
import co.com.autoex.QA.tasks.SearchProductNamed;
import co.com.autoex.QA.utils.WaitTime;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.autoex.QA.stepdefinitions.Hooks.user;
import static co.com.autoex.QA.userinterfaces.AddToCart.ADD_TO_CART;
import static co.com.autoex.QA.userinterfaces.ProductsPageUI.PRODUCTS;
import static co.com.autoex.QA.userinterfaces.SearchProductUI.BUTTON_SEARCH;
import static co.com.autoex.QA.userinterfaces.ViewCartUI.VIEW_CART;
import static co.com.autoex.QA.userinterfaces.ViewProductUI.VIEW_PRODUCT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SelectProductStepDefinition {

    public final String NAME_PRODUCT = "Blue Top";

    @Given("that the user is authenticated and on the productpage")
    public void thatTheUserIsAuthenticatedAndOnTheProductpage() {
        user.attemptsTo(ClickOn.button(PRODUCTS));
        WaitTime.putWaitTimeOf(1000);
    }
    @When("the user searches for a product named Blue Top")
    public void theUserSearchesForAProductNamed() {
        user.attemptsTo(SearchProductNamed.with(NAME_PRODUCT));
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(BUTTON_SEARCH));
    }
    @When("selects the product named \"Blue Top\" from the search results list")
    public void selectsTheProductNamedFromTheSearchResultsList() {
        user.attemptsTo(ClickOn.button(VIEW_PRODUCT));
        WaitTime.putWaitTimeOf(1000);
    }
    @When("the user presses the \"Add to Cart\" button")
    public void theUserPressesAddToCartButton() {
        user.attemptsTo(ClickOn.button(ADD_TO_CART));
        WaitTime.putWaitTimeOf(1000);

    }
    @When("the user presses the \"View Cart\" button")
    public void theUserPressesViewCartButton() {
        user.attemptsTo(ClickOn.button(VIEW_CART));
        WaitTime.putWaitTimeOf(1000);

    }
    @Then("the mini-cart should show product named Blue Top item")
    public void theMiniCartShouldShowAnIndicatorOfItem() {
        user.should(
                seeThat(NAME_PRODUCT,
                        ItemInShoppingCart.isShown()
                )
        );

    }
}