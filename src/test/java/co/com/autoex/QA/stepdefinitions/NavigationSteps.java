package co.com.autoex.QA.stepdefinitions;

import co.com.autoex.QA.tasks.GoToHomePage;
import io.cucumber.java.en.Given;
import static co.com.autoex.QA.stepdefinitions.Hooks.user;


public class NavigationSteps {

    @Given("I am on the Automation Exercise home page.")
    public void automationExerciseHomePage() {
        user.attemptsTo(
                GoToHomePage.open()
        );
    }
}
