package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignupPageUI extends PageObject {
    public static final Target SING_UP_NAME_TEXT_BOX = Target.the("Sing Up Name Text Box")
            .locatedBy("//*[@id='form']/div/div/div[3]/div/form/input[2]");
    public static final Target SING_UP_EMAIL_TEXT_BOX = Target.the("Sing Up Email Text Box")
            .locatedBy("//*[@id='form']/div/div/div[3]/div/form/input[3]");
    public static final Target SING_UP_BUTTON = Target.the("Sing Up Button")
            .locatedBy("//*[@id='form']/div/div/div[3]/div/form/button");
}
