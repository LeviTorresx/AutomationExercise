package co.com.autoex.QA.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.autoex.QA.userinterfaces.RegisterFormUI.SING_UP_CREATED_MESSAGE;

public class AccountCreated implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(SING_UP_CREATED_MESSAGE)
                .answeredBy(actor)
                .trim();

        return message.equalsIgnoreCase("ACCOUNT CREATED!");
    }

    public static AccountCreated isShown() {
        return new AccountCreated();
    }
}
