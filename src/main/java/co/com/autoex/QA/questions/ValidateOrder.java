package co.com.autoex.QA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class ValidateOrder implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return By.cssSelector("h2.title.text-center").findElement(
                BrowseTheWeb.as(actor).getDriver()
        ).getText();
    }

    public static ValidateOrder message() {
        return new ValidateOrder();
    }
}
