package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class HomePageUI  extends PageObject {
    public static final Target SING_UP_LOGIN_BUTTON = Target.the("Sing Up Login Button")
            .locatedBy("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");
}
