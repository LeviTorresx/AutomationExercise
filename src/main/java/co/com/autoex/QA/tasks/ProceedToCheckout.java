package co.com.autoex.QA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class ProceedToCheckout implements Task {

    public static ProceedToCheckout now() {
        return new ProceedToCheckout();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        By checkoutBtn = By.xpath("//a[contains(text(),'Proceed to checkout')]");
        actor.attemptsTo(Click.on(checkoutBtn));
    }
}
