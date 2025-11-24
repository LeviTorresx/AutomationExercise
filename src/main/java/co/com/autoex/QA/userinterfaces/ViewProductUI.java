package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewProductUI extends PageObject {
    public static final Target VIEW_PRODUCT = Target.the("view product")
            .locatedBy("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
}
