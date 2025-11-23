package co.com.autoex.QA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.autoex.QA.userinterfaces.SignupPageUI.EMAIL_ALREADY_EXISTS_MESSAGE;

public class EmailAlreadyExistsMessage implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(EMAIL_ALREADY_EXISTS_MESSAGE)
                .answeredBy(actor)
                .trim();

        return message.equalsIgnoreCase("Email Address already exist!");
    }

    public static EmailAlreadyExistsMessage isVisible() {
        return new EmailAlreadyExistsMessage();
    }
}
