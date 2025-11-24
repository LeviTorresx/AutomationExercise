package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ViewCartUI extends PageObject {
    public static final Target VIEW_CART = Target.the("View Cart")
            .locatedBy("//*[@id='cartModal']/div/div/div[2]/p[2]/a");

    public static final Target VIEW_NAME_PRODUCT = Target.the("View Name Product")
            .locatedBy("//*[@id='product-1']/td[2]/h4/a");

}
