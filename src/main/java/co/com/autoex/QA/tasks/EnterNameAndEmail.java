package co.com.autoex.QA.tasks;


import co.com.autoex.QA.interactions.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class EnterNameAndEmail implements Task {

    private final String name;
    private final String email;
    private final Target nameField;
    private final Target emailField;

    public EnterNameAndEmail(String name, String email, Target nameField, Target emailField) {
        this.name = name;
        this.email = email;
        this.nameField = nameField;
        this.emailField = emailField;
    }

    public static EnterNameAndEmail with(String name, String email,
                                         Target nameField, Target emailField) {
        return Tasks.instrumented(
                EnterNameAndEmail.class,
                name, email, nameField, emailField
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EnterThe.text(name, nameField),
                EnterThe.text(email, emailField)
        );
    }
}
