package co.com.autoex.QA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class AddToCart implements Task {

    public static AddToCart now() {
        return new AddToCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        By addCartBtn = By.xpath("//button[contains(text(),'Add to cart')]");
        actor.attemptsTo(Click.on(addCartBtn));
    }
}

