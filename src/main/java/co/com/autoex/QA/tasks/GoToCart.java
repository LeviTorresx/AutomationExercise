package co.com.autoex.QA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class GoToCart implements Task {

    public static GoToCart view() {
        return new GoToCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        By viewCart = By.xpath("//a[contains(text(),'View cart')]");
        actor.attemptsTo(Click.on(viewCart));
    }
}
