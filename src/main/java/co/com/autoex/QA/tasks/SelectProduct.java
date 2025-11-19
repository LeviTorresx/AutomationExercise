package co.com.autoex.QA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectProduct implements Task {

    private final String productName;

    public SelectProduct(String productName) {
        this.productName = productName;
    }

    public static SelectProduct called(String productName) {
        return new SelectProduct(productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target product = Target.the("product called " + productName)
                .locatedBy("//h2[contains(text(),'{0}')]");
        actor.attemptsTo(
                Click.on(product.of(productName))
        );
    }
}


