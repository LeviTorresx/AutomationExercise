package co.com.autoex.QA.stepdefinitions;

import co.com.autoex.QA.questions.ValidateOrder;
import co.com.autoex.QA.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ProductSelectionStepDefinition {

    protected static Actor user;

    @Managed(driver = "chrome")
    public WebDriver theDriver;

    @Before
    public void setUp() {
        if (user == null) {
            user = Actor.named("Levi");
            user.can(BrowseTheWeb.with(theDriver));
        }
    }

    @When("the user selects the product {string}")
    public void selectionProduct(String product) {
        user.attemptsTo(
                SelectProduct.called(product)
        );
    }

    @When("adds the product to the cart")
    public void addToCart() {
        user.attemptsTo(
                AddToCart.now()
        );
    }

    @When("goes to the cart from the View Cart link")
    public void goToCart() {
        user.attemptsTo(
                GoToCart.view()
        );
    }

    @When("proceeds to checkout")
    public void proceedToCheckout() {
        user.attemptsTo(
                ProceedToCheckout.now()
        );
    }

    @Then("the order should be successfully confirmed")
    public void validateOrder() {
        user.should(
                seeThat(
                        ValidateOrder.message(),
                        containsString("ORDER PLACED")
                )
        );
    }
}
