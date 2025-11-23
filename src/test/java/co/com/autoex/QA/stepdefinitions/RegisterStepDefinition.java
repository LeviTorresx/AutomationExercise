package co.com.autoex.QA.stepdefinitions;

import co.com.autoex.QA.models.UserData;
import co.com.autoex.QA.questions.AccountCreated;
import co.com.autoex.QA.tasks.ClickOn;
import co.com.autoex.QA.tasks.EnterNameAndEmail;
import co.com.autoex.QA.tasks.FillTheRegisterForm;
import co.com.autoex.QA.utils.WaitTime;
import static co.com.autoex.QA.userinterfaces.HomePageUI.*;
import static co.com.autoex.QA.userinterfaces.RegisterFormUI.SING_UP_CREATE_ACCOUNT_BUTTON;
import static co.com.autoex.QA.userinterfaces.RegisterFormUI.SING_UP_CONTINUE;
import static co.com.autoex.QA.userinterfaces.SignupPageUI.*;
import static co.com.autoex.QA.stepdefinitions.Hooks.user;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegisterStepDefinition {

    public final String NAME_GLOBAL = "levi";
    public final String EMAIL_GLOBAL = "levi198@test.com";


    @Given("I am enter the Signup-Login section")
    public void iImEnterTheSignup(){
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(SING_UP_LOGIN_BUTTON));
    }
    @When("I enter a valid name and a valid email address")
    public void iEnterAValidNameAndAValidEmailAddress() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(
                EnterNameAndEmail.with(NAME_GLOBAL, EMAIL_GLOBAL, SING_UP_NAME_TEXT_BOX, SING_UP_EMAIL_TEXT_BOX)
        );

    }
    @When("I continue to the registration form")
    public void iContinueToTheRegistrationForm() {
        WaitTime.putWaitTimeOf(1000);
        user.attemptsTo(ClickOn.button(SING_UP_BUTTON));
    }
    @When("I complete the required information on the form")
    public void iCompleteTheRequiredInformationOnTheForm() {
        UserData data;
        data = new UserData(
                NAME_GLOBAL,
                EMAIL_GLOBAL,
                "123456",
                "Levi",
                "Torres",
                "10",
                "May",
                "2000",
                "UdeA",
                "Street 123",
                "Apt 22",
                "Canada",
                "Toronto",
                "Ontario",
                "50001",
                "3001234567"
        );

        user.attemptsTo(
                FillTheRegisterForm.with(data)
        );

        WaitTime.putWaitTimeOf(2000);
        user.attemptsTo(ClickOn.button(SING_UP_CREATE_ACCOUNT_BUTTON));
    }
    @Then("the account should be created correctly")
    public void theAccountShouldBeCreatedCorrectly() {
        user.should(
                seeThat("Account creation message",
                        AccountCreated.isShown()
                )
        );
        user.attemptsTo(
                ClickOn.button(SING_UP_CONTINUE)
        );
    }
}
