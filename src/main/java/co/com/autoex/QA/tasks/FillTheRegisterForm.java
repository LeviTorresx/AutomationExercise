package co.com.autoex.QA.tasks;


import co.com.autoex.QA.interactions.EnterThe;
import co.com.autoex.QA.interactions.SelectThe;
import co.com.autoex.QA.models.UserData;
import static co.com.autoex.QA.userinterfaces.RegisterFormUI.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FillTheRegisterForm implements Task {

    private final UserData user;

    public FillTheRegisterForm(UserData user) {
        this.user = user;
    }

    public static FillTheRegisterForm with(UserData user) {
        return Tasks.instrumented(FillTheRegisterForm.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SING_UP_MR_GENDER),

                EnterThe.text(user.getPassword(), SING_UP_PASSWORD),

                SelectThe.option(user.getDay(), SING_UP_DAYS),
                SelectThe.option(user.getMonth(), SING_UP_MONTHS),
                SelectThe.option(user.getYear(), SING_UP_YEARS),

                EnterThe.text(user.getFirstName(), SING_UP_FIRST_NAME),
                EnterThe.text(user.getLastName(), SING_UP_LAST_NAME),
                EnterThe.text(user.getCompany(), SING_UP_COMPANY),
                EnterThe.text(user.getAddress(), SING_UP_ADDRESS1),
                EnterThe.text(user.getAddress2(), SING_UP_ADDRESS2),

                SelectThe.option(user.getCountry(), SING_UP_COUNTRY),

                EnterThe.text(user.getState(), SING_UP_STATE),
                EnterThe.text(user.getCity(), SING_UP_CITY),
                EnterThe.text(user.getZipcode(), SING_UP_ZIP_CODE),
                EnterThe.text(user.getPhone(), SING_UP_MOBILE_NUMBER)
        );

    }
}
