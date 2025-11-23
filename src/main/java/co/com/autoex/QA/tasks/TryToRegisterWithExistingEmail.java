package co.com.autoex.QA.tasks;

import co.com.autoex.QA.interactions.EnterThe;
import co.com.autoex.QA.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.autoex.QA.userinterfaces.SignupPageUI.*;


public class TryToRegisterWithExistingEmail implements Task {

    private final String name;
    private final String email;

    public TryToRegisterWithExistingEmail(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static TryToRegisterWithExistingEmail using(String name, String email) {
        return Tasks.instrumented(TryToRegisterWithExistingEmail.class, name, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterThe.text(name, SING_UP_NAME_TEXT_BOX),
                EnterThe.text(email, SING_UP_EMAIL_TEXT_BOX)
        );
        WaitTime.putWaitTimeOf(1000);
        actor.attemptsTo(
                ClickOn.button(SING_UP_BUTTON)
        );
        WaitTime.putWaitTimeOf(1000);
    }
}
