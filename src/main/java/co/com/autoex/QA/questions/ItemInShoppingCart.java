package co.com.autoex.QA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.autoex.QA.userinterfaces.ViewCartUI.VIEW_NAME_PRODUCT;


public class ItemInShoppingCart implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(VIEW_NAME_PRODUCT)
                .answeredBy(actor)
                .trim();

        return message.equalsIgnoreCase("Blue Top");
    }

    public static ItemInShoppingCart isShown() {
        return new ItemInShoppingCart();
    }
}

