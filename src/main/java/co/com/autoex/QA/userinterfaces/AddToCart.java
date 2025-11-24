package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCart extends PageObject {

    public static final Target ADD_TO_CART = Target.the("Products")
            .locatedBy("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
}
