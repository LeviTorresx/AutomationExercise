package co.com.autoex.QA.stepdefinitions;

import co.com.autoex.QA.questions.EmailAlreadyExistsMessage;
import co.com.autoex.QA.tasks.ClickOn;
import co.com.autoex.QA.tasks.TryToRegisterWithExistingEmail;
import co.com.autoex.QA.utils.WaitTime;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static co.com.autoex.QA.stepdefinitions.Hooks.user;
import static co.com.autoex.QA.userinterfaces.HomePageUI.SING_UP_LOGIN_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EmailAlreadyStepDefinition
{
    @Given("that I enter the “Signup - Login” section")
    public void thatIEnterTheSignupLoginSection() {
        user.attemptsTo(
                ClickOn.button(SING_UP_LOGIN_BUTTON)
        );
    }
    @When("I try to register with an email that already exists")
    public void iTryToRegisterWithAnInvalidEmailAddress() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(
                TryToRegisterWithExistingEmail.using("Levi", "levi@test.com")
        );

    }
    @Then("the message “Email Address already exists!” should be displayed")
    public void aMessageShouldBeDisplayedIndicatingThatTheEmailAddressIsInvalid() {
        WaitTime.putWaitTimeOf(1000);
        user.should(
                seeThat(EmailAlreadyExistsMessage.isVisible())
        );
    }
}
